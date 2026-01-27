/**
 * @author Weiquan Mai
 * Problem 10.1
 * (The Time class)
 * Design a class named Time. The class contains:
 * - The data fields hour, minute, and second that represent a time.
 * - A no-arg constructor that creates a Time object for the current time.
 * (The values of the data fields will represent the current time.)
 * - A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds.
 * (The values of the data fields will represent this time.)
 * - A constructor that constructs a Time object with the specified hour, minute, and second.
 * - Three getter methods for the data fields hour, minute, and second, respectively.
 * - A method named setTime(long elapedTime) that sets a new time for the object
 * using the elpased time. For example, if the elapsed time is 555550000
 * milliseconds, the hour is 10, the minute is 19, and the second is 10.
 *
 * Write a test program that creates three Time objects
 * (using new Time(), new Time(555550000), and new Time(5, 23, 55)) and displays their hour,
 * minute, and second in the format hour:minute:second.
 */

class Time {
    // Variables
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor
    public Time(){
        this(System.currentTimeMillis());
    }

    // Overloaded constructor with specified elapsed time
    public Time(long elapseTime){
        this.setTime(elapseTime);
    }

    // Overloaded constructor with specified hour, minute, and second
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Three getter methods
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    /**
     * Set a new time for the object using elapsed time
     * @param elapseTime Time since epoch in milliseconds
     */
    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000;
        int currentSecond = (int) totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int) totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        int currentHour = (int) totalHours % 24;
        this.hour = currentHour;
        this.minute = currentMinute;
        this.second = currentSecond;
    }

    /**
     * Overrides toString to display time in hour:minute:seconds: format
     * @return String in hour:minute:second format
     */
    @Override
    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
