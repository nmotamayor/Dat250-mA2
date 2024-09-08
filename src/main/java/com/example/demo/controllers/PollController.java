    package com.example.demo.controllers;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import com.example.demo.PollManager;
    import com.example.demo.models.Poll;

    import java.util.List;

    @RestController
    @RequestMapping("/polls")
    public class PollController {

        @Autowired
        private PollManager pollManager;

        // Get all polls
        @GetMapping(produces = "application/json")
        public ResponseEntity<List<Poll>> getPolls() {
            List<Poll> polls = pollManager.getAllPolls();
            return ResponseEntity.ok(polls);
        }

        // Create a new poll
        @PostMapping(consumes = "application/json", produces = "application/json")
        public ResponseEntity<Poll> createPoll(@RequestBody Poll poll) {
            Poll createdPoll = pollManager.createPoll(poll);
            return ResponseEntity.status(201).body(createdPoll);
        }

        // Get a specific poll by ID
        @GetMapping(value = "/{pollId}", produces = "application/json")
        public ResponseEntity<Poll> getPollById(@PathVariable String pollId) {
            Poll poll = pollManager.getPollById(pollId);
            return ResponseEntity.ok(poll);
        }

        // Update an existing poll
        @PutMapping(value = "/{pollId}", consumes = "application/json", produces = "application/json")
        public ResponseEntity<Poll> updatePoll(@PathVariable String pollId, @RequestBody Poll poll) {
            Poll updatedPoll = pollManager.createPoll(poll);
            return ResponseEntity.ok(updatedPoll);
        }

        // Delete a poll by ID
        @DeleteMapping("/{pollId}")
        public ResponseEntity<Void> deletePoll(@PathVariable String pollId) {
            boolean isDeleted = pollManager.deletePoll(pollId);
            if (!isDeleted) {
                return ResponseEntity.notFound().build();  // Return 404 if poll not found
            }
            return ResponseEntity.noContent().build();  // Return 204 if deletion was successful
        }


        // Vote on a poll
        @PostMapping("/{pollId}/vote")
        public ResponseEntity<Void> vote(@PathVariable String pollId, @RequestParam String userId, @RequestParam String option) {
            Poll poll = pollManager.getPollById(pollId);
            if (poll == null) {
                return ResponseEntity.notFound().build();  // If poll does not exist, return 404
            }
            // Update the poll's vote count for the given option and user
            poll.getVotes().put(userId, option);
            pollManager.createPoll(poll);
            return ResponseEntity.ok().build();  // Return a 200 OK response
        }
    }
