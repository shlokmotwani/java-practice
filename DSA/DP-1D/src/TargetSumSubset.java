public class TargetSumSubset {
    public static boolean check(int[] A, int idx, int target){
        if(target == 0){
            return true;
        }
        if(idx < 0 || target < 0){
            return false;
        }
        boolean f1 = check(A, idx-1, target);
        boolean f2 = check(A, idx-1, target - A[idx]);
        return f1 || f2;
    }
    public static void main(String[] args) {
        int[] input = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println(check(input, input.length - 1, target));
    }
}
