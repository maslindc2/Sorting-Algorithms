import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) throws Exception {
        int[] numArray = {10, 7,8,9,1,5};
        quickSort(numArray, 0, numArray.length-1);
        System.out.println("Result: " + Arrays.toString(numArray));
        
    }
    
    public static int partition(int array[], int low, int high) {
        //pivot element to be placed at right position
        int pivot = array[high];

        //index of smaller element and indicates the right position of pivot
        //found so far
        int i = (low -1);
    
        for (int j = low; j <= high-1; j++) {
            //Checks if the current element is smaller than the pivot
            if(array[j] < pivot){
                //Increment index of smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return (i+1);
    }

    //Swaps the two elements
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //Quick sort function
    public static void quickSort(int array[], int low, int high) {
        if(low < high){
            int partitionIndex = partition(array, low, high);
            //Sort the elements before partition and after partition
            quickSort(array, low, partitionIndex-1);
            quickSort(array, partitionIndex + 1, high);
        }
    }
}
