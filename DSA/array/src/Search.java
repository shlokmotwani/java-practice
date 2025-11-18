public class Search {
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
