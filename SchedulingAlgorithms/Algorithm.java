package SchedulingAlgorithms;

public interface Algorithm {

    /**
        The schedule() method obtains the next task to be run on the CPU by invoking
        the pickNextTask() method and then executes this Task by calling the
        static run() method in the CPU.java class.
     **/

    // Implementation of scheduling algorithm
    void schedule();

    // Selects the next task to be scheduled
    Task pickNetTask();
}
