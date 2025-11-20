public class StrangeEquality {
    public int solve(int A) {
        int msbIdx = -1;
        int X = A;
        int Y = 0;
        for(int i=30; i>=0; i--){
            int mask = (1<<i);
            if((A&mask) > 0){
                msbIdx = i;
                break;
            }
        }

        // System.out.println("MSB = " + msbIdx);
        for(int i=0; i<=msbIdx; i++){
            int mask = (1<<i);
            X = X^mask;
        }

        Y = (1<<(msbIdx+1));
        // System.out.println("X = " + X + " Y = " + Y);
        return X^Y;
    }
}