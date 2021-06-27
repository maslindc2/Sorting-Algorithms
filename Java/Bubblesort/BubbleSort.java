import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {65,12,1,3,4,7,8,9,45};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    //swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
