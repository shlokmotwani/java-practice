public class SortByColor {
    public int[] sortColors(int[] A) {
        int N = A.length;
        int[] farr = new int[3];

        for(int i = 0; i<N; i++){
            int item = A[i];
            farr[item] += 1;
        }

        int j = 0;
        for(int i = 0; i < farr.length; i++){
            int count = 1;
            int total = farr[i];
            while(count <= total){
                A[j] = i;
                j++;
                count++;
            }
        }
        return A;
    }
}
