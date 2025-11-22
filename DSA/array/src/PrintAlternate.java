public class PrintAlternate {
    public static void printAlternate(int[] A){
        int N = A.length;
        for(int i=0; i<N; i+=2){
            System.out.println(A[i]);
        }
    }

    public static void printAlternateRecursively(int[] A, int idx){
        if(idx >= A.length){
            return;
        }
        System.out.println(A[idx]);
        printAlternateRecursively(A, idx+2);
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printAlternate(A);
        printAlternateRecursively(A, 1);
    }
}
