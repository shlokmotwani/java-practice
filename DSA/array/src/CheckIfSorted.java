public class CheckIfSorted {
    public static boolean checkIfSorted(int[] A){
        int N = A.length;
        for(int i=1; i<N; i++){
            if(A[i] < A[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = {90, 80, 100, 70, 40, 30};
        System.out.println(checkIfSorted(arr));
        System.out.println(checkIfSorted(arr2));
    }
}
