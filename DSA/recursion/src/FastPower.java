public class FastPower {
    public long power(int A, int B) {
        if(B < 0){
            return -1;
        }

        if(B == 0){
            return 1;
        }

        if(A == 1){
            return 1;
        }
        long p = power(A, B/2);

        if(B%2 == 0){
            return p*p;
        }
        return p*p*A;
    }
}
