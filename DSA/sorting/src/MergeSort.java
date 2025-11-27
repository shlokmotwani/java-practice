import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] A, int low, int high){
        if(low == high){
            return A;
        }
        int mid = (low + high) / 2;
        mergeSort(A, low, mid);
        mergeSort(A, mid+1, high);
        mergeSortedArrays(A, low, mid, high);
        return A;
    }

    public static void mergeSortedArrays(int[] A, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int[] temp = new int[high-low+1];
        int idx = 0;
        while(i <= mid && j <= high){
            if(A[i] <= A[j]){
                temp[idx] = A[i];
                i++;
            }
            else{
                temp[idx] = A[j];
                j++;
            }
            idx++;
        }
        while(i <= mid){
            temp[idx] = A[i];
            i++;
            idx++;
        }
        while(j <= high){
            temp[idx] = A[j];
            j++;
            idx++;
        }

        for(int x=low; x<=high; x++){
            A[x] = temp[x-low];
        }
    }

    public static void main(String[] args) {
         int[] A = new int[]{3, 10, 6, 8, -10, 15, 2, 12, -1, 18, 17, -90, -3};
        System.out.println(Arrays.toString(mergeSort(A, 0, A.length-1)));
    }
}