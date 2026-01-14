/**
 * @author Weiquan Mai
 * Problem 7.16
 * (Execution time)
 * Write a program that creates an array of numbers from 1 to 100,000,000 in ascending order.
 * Display the execution time of invoking the linearSearch method
 * and the binarySEarch method in Listings 7.6 and 7.7 respectively.
 * Display the execution time of invoking both searches for the following numbers:
 * 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000;
 * you can use the following code template to obtain the execution time:
 * long startTime = System.nanoTime();
 * perform the task;
 * long endTime = System.nanoTime();
 * long executionTime = endTime − startTime;
 */
public class Exercise07_16 {
    public static void main(String[] args){
        // Create an array of numbers from 1 to 100,000,000 in ascending order
        int[] array = new int[100000000 + 1];
        for(int i = 1; i <= 100000000; i++){
            array[i] = i;
        }

        // Display execution time for invoking both searches for
        // 1, 25,000,000, 50,000,000, 75,000,000, and 100,000,000

        // Linear Search
        long startTime = System.nanoTime();
        int index = linearSearch(array, 1);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Linear search value: " + 1 + " for " + executionTime + " nanoseconds");

        for(int i = 25000000; i <= 100000000; i += 25000000){
            startTime = System.nanoTime();
            index = linearSearch(array, i);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Linear search value: " + i + " for " + executionTime + " nanoseconds");
        }

        // Binary Search
        startTime = System.nanoTime();
        index = binarySearch(array, 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Binary search value: " + 1 + " for " + executionTime + " nanoseconds");

        for(int i = 25000000; i <= 100000000; i += 25000000){
            startTime = System.nanoTime();
            index = binarySearch(array, i);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Binary search value: " + i + " for " + executionTime + " nanoseconds");
        }

    }

    /**
     * Method for finding a key in the list via linear search
     * @param list List of numbers
     * @param key Key value to find from list
     * @return Either index of key in list, or -1 if key is not found
     */
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Use binary search to find the key in the list
     * @param list List of numbers
     * @param key Key value to find from list
     * @return Either index of key in list, or -low -1 if key is not found
     */
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;

        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }

        return -low -1;
    }
}
