import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] A, int low, int high){
        if(low > high){
            return;
        }
        int pvt = partition(A, low, high);
        quickSort(A, low, pvt-1);
        quickSort(A, pvt+1, high);
    }

    public static int partition(int[] A, int low, int high){
        int pivot = low;
        int i = low+1;
        int j = high;
        while(i <= j){
            if(A[i] < A[pivot]){
                i++;
            }
            else if(A[j] > A[pivot]){
                j--;
            }
            else{
                swap(A, i, j);
                i++;
                j--;
            }
        }
        swap(A, pivot, j);
        return j;
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = new int[]{54, 26, 93, 17, 77, 31, 44, 55, 40};
        quickSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
    }
}
