public class Palindrome {
    public int solve(String A) {
        int N = A.length();
        return isPalindrome(A, 0, N-1);
    }

    public int isPalindrome(String A, int start, int end){
        if(start >= end){
            return 1;
        }

        if(A.charAt(start) != A.charAt(end)){
            return 0;
        }

        return isPalindrome(A, start+1, end-1);
    }
}
