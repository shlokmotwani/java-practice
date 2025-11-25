public class IsMagic {
    public int solve(int A) {
        return sumOfDigits(A) == 1 ? 1 : 0;
    }

    public int sumOfDigits(int A){
        if(A < 0){
            return 0;
        }

        if(A / 10 == 0){
            return A;
        }

        int sum = 0;
        while(A > 0){
            sum += A%10;
            A = A/10;
        }
        return sumOfDigits(sum);
    }
}
