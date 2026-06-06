import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] dp = new int[num+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(num, dp));
    }

    public static int fib(int N, int[] dp){
        if(N == 0 || N == 1){
            return N;
        }
        if(dp[N] != -1){
            return dp[N];
        }
        dp[N] = fib(N-1, dp) + fib(N-2, dp);
        return dp[N];
    }
}
