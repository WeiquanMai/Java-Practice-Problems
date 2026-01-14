/**
 * @author Weiquan Mai
 * Problem 7.18
 * (Bubble sort)
 * Write a sort method that uses the bubble-sort algorithm.
 * The bubble-sort algorithm makes several passes through the array.
 * On each pass, successive neighboring pairs are compared.
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged.
 * The technique is called a bubble sort or sinking sort because the smaller values
 * gradually "bubble" their way to the top and the larger values "sink" to the bottom.
 * Write a test program that reads in 10 double numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise07_18 {
    public static void main(String[] args){
        // Read in 10 double numbers
        double[] array = {1.0, 100.96, 30.5, 80.6, 99.9, 54.6, 68.1, 74.3, 88.8, 102.2};

        // Invoke the method and display the sorted numbers
        double[] sortedArray = bubbleSort(array);
        System.out.print("Sorted array: ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }

    /**
     * Sorts the array from smallest to largest
     * @param array Array to be sorted
     * @return Sorted array
     */
    public static double[] bubbleSort(double[] array){
        boolean isSorted = false;
        int numberOfSwaps = 0;

        
        while(!isSorted){
            numberOfSwaps = 0;
            for(int i = 0; i < array.length - 1; i++){
                // Compare neighboring pairs. If the pair is not in order, swap them
                if(array[i] > array[i + 1]){
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numberOfSwaps++;
                }
            }
            
            // If there are no swaps, then the array is sorted
            if(numberOfSwaps == 0){
                isSorted = true;
            }
        }

        return array;
    }
}
