import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) throws Exception {
        int[] numArray = {5,4,7,8,2,1,3,6};
        System.out.println("Unsorted Array: " + Arrays.toString(numArray));
        selectionSort(numArray);
        System.out.println("Result: " + Arrays.toString(numArray));
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minElement = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minElement]) {
                    minElement = j;
                }    
            }
            int temp = array[minElement];
            array[minElement] = array[i];
            array[i] = temp;
        }
    }


}
