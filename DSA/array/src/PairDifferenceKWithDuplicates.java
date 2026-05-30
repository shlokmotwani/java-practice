public class PairDifferenceKWithDuplicates {
    public static int fun(int[] A, int target){
        int N = A.length;

        int count = 0;
        int i = 0;
        int j = 1;

        while(j < N){
            if(i == j){
                j++;
                continue;
            }
            int diff = A[j] - A[i];
            if(diff < target){
                j++;
            }
            else if(diff > target){
                i++;
            }
            else{
                int lcount = 0;
                int num1 = A[i];

                while(i < j && A[i] == num1){
                    lcount++;
                    i++;
                }

                int rcount = 0;
                int num2 = A[j];

                while(j < N && A[j] == num2){
                    rcount++;
                    j++;
                }
                count += lcount*rcount;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] input = {1,2,2,2,2,4,5,5,6,12,12,12};
        System.out.println(fun(input, 0));
    }
}


