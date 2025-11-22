public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] A){
        int N = A.length;
        int duplicatesCount = 0;
        for(int i=1; i<N; i++){
            if(A[i] == A[i-1]){
                duplicatesCount++;
            }
        }
        int[] result = new int[N-duplicatesCount];
        result[0] = A[0];
        int idx = 1;
        for(int i=1; i<N; i++){
            if(A[i] != A[i-1]){
                result[idx] = A[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        int[] result = removeDuplicates(arr);
        for(int item: result){
            System.out.print(item + " ");
        }
        System.out.println();

        int[] arr2 = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] result2 = removeDuplicates(arr2);
        for(int item: result2){
            System.out.print(item + " ");
        }
        System.out.println();

        int[] arr3 = {1, 2, 3};
        int[] result3 = removeDuplicates(arr3);
        for(int item: result3){
            System.out.print(item + " ");
        }
    }
}
