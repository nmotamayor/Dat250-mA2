package com.example.demo;

import com.example.demo.models.Poll;
import com.example.demo.models.User;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PollManager {

    private Map<String, Poll> polls;
    private Map<String, User> users;

    // Constructor initializes the in-memory maps
    public PollManager() {
        this.polls = new HashMap<>();
        this.users = new HashMap<>();
    }

    // Poll Management Methods

    // Create or update a poll
    public Poll createPoll(Poll poll) {
        polls.put(poll.getId(), poll);  // Add or update poll in the map
        return poll;
    }

    // Retrieve a poll by ID
    public Poll getPollById(String id) {
        return polls.get(id);
    }

    // Delete a poll by ID
    public boolean deletePoll(String id) {
        if (polls.containsKey(id)) {
            polls.remove(id);
            return true;  // Poll was found and deleted
        }
        return false;  // Poll was not found
    }

    // Get all polls as a list
    public List<Poll> getAllPolls() {
        return new ArrayList<>(polls.values());  // Convert the map values (Poll objects) to a list
    }

    // User Management Methods

    // Create or update a user
    public User createUser(User user) {
        users.put(user.getId(), user);  // Add or update user in the map
        return user;
    }

    // Retrieve a user by ID
    public User getUserById(String id) {
        return users.get(id);
    }

    // Delete a user by ID
    public void deleteUser(String id) {
        users.remove(id);
    }

    // Get all users as a list
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());  // Convert the map values (User objects) to a list
    }

    // Clear all polls and users (for testing)
    public void clearAll() {
        polls.clear();  // Clear all polls
        users.clear();  // Clear all users
    }
    
}
