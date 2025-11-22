public class MoveZeroesToEnd {
    public static void moveZeroes(int[] A){
        int N = A.length;
        int count = 0;
        for(int i=0; i<N; i++) {
            if (A[i] != 0) {
                int temp = A[i];
                A[i] = A[count];
                A[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        for(int item: arr){
            System.out.print(item + " ");
        }
        System.out.println();

        int[] arr2 = {0, 0};
        moveZeroes(arr2);
        for(int item: arr2){
            System.out.print(item + " ");
        }
        System.out.println();

        int[] arr3 = {10, 20, 30};
        moveZeroes(arr3);
        for(int item: arr3){
            System.out.print(item + " ");
        }
    }
}
