public class Sort012 {
    public static int[] sort(int[] A){
        int N = A.length;
        int i=0;
        int j=0;
        int k=N-1;

        while(i <= k){
            if(A[i] == 0){
                swap(A, i, j);
                i++;
                j++;
            }
            else if(A[i] == 1) {
                i++;
            }
            else{
                swap(A, i, k);
                k--;
            }
        }
        return A;
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        int[] A = {1,0,1,1,2,0,2,1,0,2};
        int[] B = sort(A);

        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
