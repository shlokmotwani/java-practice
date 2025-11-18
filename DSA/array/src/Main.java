
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 40));
        System.out.println(binarySearch(arr, 50));
        System.out.println(binarySearch(arr, 80));
        System.out.println(binarySearch(arr, 100));
    }

    public static int binarySearch(int[] A, int target){
        int N = A.length;
        int start = 0;
        int end = N-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(A[mid] < target){
                start = mid + 1;
            }
            else if(A[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}