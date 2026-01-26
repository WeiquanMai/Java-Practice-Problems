/**
 * @author Weiquan Mai
 * Problem 9.6
 * (Stopwatch)
 * Design a class named StopWatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 *
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
class StopWatch {
    // Variables
    private long startTime;
    private long endTime;

    // No-args constructor
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    // Accessor methods
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }

    /**
     * Resets start time to current time
     */
    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Sets end time to current time
     */
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    /**
     * Calculates and returns elapsed time from start time to end time
     * @return Elapsed time from start time to end time
     */
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
