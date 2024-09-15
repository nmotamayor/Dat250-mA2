DAT250 - Experiment Assignment 6 Report
Technical Problems Encountered

During the completion of this assignment, I faced several technical challenges, particularly related to the vote counting feature. The main issue was ensuring that the vote count updated automatically on the front-end without needing to refresh the page. Although we tried several approaches using useEffect and refresh functions to trigger poll updates after a vote was cast, I were unable to achieve this functionality perfectly. The vote count updates correctly after switching between polls or refreshing the page, but does not reflect instantly after a vote is cast.

I also encountered a bug where downvoting from one poll would incorrectly affect the vote count of another poll. This issue was later fixed by adjusting the vote handling logic on both the front-end and the back-end to ensure each vote was associated correctly with its respective poll.

Lastly, during deployment, there were some challenges related to configuring the npm run build process for the front-end application and ensuring that the files were correctly integrated into the Spring Boot back-end’s /static directory.
Link to Code

Link to the repository for experiments 1-2
Pending Issues

The main pending issue is that the vote count does not refresh automatically without manually refreshing the page or switching between polls. I attempted several solutions, but were unable to fully resolve this before submission.