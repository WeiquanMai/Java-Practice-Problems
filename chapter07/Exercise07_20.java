/**
 * @author Weiquan Mai
 * Problem 7.20
 * (Descending Bubble Sort)
 * Modify the bubble sort method or programming Exercise 7.18,
 * and sort the elements in the array in descending order instead of ascending order.
 * Write a test program that reads 10 double numbers, invokes the method,
 * and displays the sorted numbers in descending order.
 */
public class Exercise07_20 {
    public static void main(String[] args){
        // Read in 10 double numbers
        double[] array = {1.0, 100.96, 30.5, 80.6, 99.9, 54.6, 68.1, 74.3, 88.8, 102.2};

        // Invoke the method and display the sorted numbers
        double[] sortedArray = bubbleSortDescending(array);
        System.out.print("Descending order: ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }

    /**
     * Utilize bubble sort to sort the array in descending order
     * @param array List of double numbers
     * @return Sorted array in descending order
     */
    public static double[] bubbleSortDescending(double[] array){
        // Variables
        boolean isSorted = false;
        int swapCounter = 0;

        while(!isSorted){
            swapCounter = 0;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapCounter++;
                }
            }
            if(swapCounter == 0){
                isSorted = true;
            }
        }

        return array;
    }
}
