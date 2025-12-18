package org.example;

public class AthMagicalNumber {
    public int solve(int A, int B, int C) {
        long left = Math.min(B, C);
        long right = (long)A * left;
        long mid = 0;
        long best = 0;
        long lcmValue = lcm(B, C);
        while(left <= right){
            mid = left + (right - left) / 2;
            long magicalNumCount = (mid/B) + (mid/C) - (mid/lcmValue);
            if(magicalNumCount >= A){
                best = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return (int)(best % 1000000007);
    }

    public long lcm(int A, int B){
        return ((long)A*B)/gcd(A, B);
    }

    public int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        return gcd(B, A%B);
    }
}
