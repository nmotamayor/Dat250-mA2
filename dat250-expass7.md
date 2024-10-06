# DAT250 Experiment Assignment 6

## Technical Problems Encountered

During the completion of the tutorials, I encountered several technical issues:

### Experiment 1: Installation
The initial RabbitMQ installation via Chocolatey failed due to permission errors related to accessing specific directories (`C:\ProgramData\chocolatey\lib-bad`). After troubleshooting, I resolved the issue by running the command prompt as an administrator and ensuring that all required permissions were set correctly.

### Experiment 2: Hello World
For the Hello World experiment, I had to set up a Gradle project to manage dependencies like the RabbitMQ Java client and SLF4J libraries. The setup worked smoothly, and I was able to send and receive a "Hello World" message through RabbitMQ.

### Experiment 3: Work Queues
This experiment required me to simulate time-consuming tasks by making use of RabbitMQ's work queue system. After modifying the consumer (`Worker.java`) to simulate processing time using `Thread.sleep()`, I successfully tested the round-robin message distribution among multiple workers. Message acknowledgment and task persistence were also configured without any major issues.

### Experiment 4: Topics (Incomplete)
I was unable to fully complete Experiment 4, which focused on implementing a publish/subscribe system using the `topic` exchange. I encountered errors related to setting up and running the Java client with the necessary RabbitMQ libraries. Despite attempts to configure the correct classpath and include the required dependencies, I was unable to compile and run the necessary Java files for the topic exchange setup.

## Link to Code for Experiments 1-3
You can find the code for Experiments 1-3 in the following repository:

[GitHub Repository Link](https://github.com/nmotamayor/RabbitMQHelloWorld/blob/master/src/main/java/NewTask.java)

### Pending Issues
As mentioned, I was unable to complete Experiment 4: Topics due to unresolved issues with the RabbitMQ Java client setup. Specifically, there were problems related to missing dependencies and classpath configuration that I could not resolve in time.

