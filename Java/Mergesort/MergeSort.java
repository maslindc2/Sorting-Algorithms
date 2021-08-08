import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        int[] numArray = {12,11,13,5,6,7};
        
        // inputArray, Low, High
        sort(numArray, 0, numArray.length-1);

        System.out.println(Arrays.toString(numArray));
    }
    public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two sub-arrays to be merged
        int sizeL = m - l + 1;
        int sizeR = r - m;

        /* Create temp arrays */
        int L[] = new int[sizeL];
        int R[] = new int[sizeR];

        /*Copy data to temp arrays*/
        for (int i = 0; i < sizeL; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < sizeR; ++j)
            R[j] = arr[m + 1 + j];

        

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = l;
        /* Merge the temp arrays */
        while (i < sizeL && j < sizeR) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < sizeL) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < sizeR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
