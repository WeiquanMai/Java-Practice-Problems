/**
 * @Author Weiquan Mai
 * Problem 1.10
 * (Average speed in miles)
 * Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise01_10 {
    public static void main(String[] args){
        double miles = 15.0 / 1.6;
        double hour = ((50.0 * 60) + 30) / (60 * 60);
        double mph = miles / hour;
        System.out.println("Miles per hour: " + mph);
    }
}
