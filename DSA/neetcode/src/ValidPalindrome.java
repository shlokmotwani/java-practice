public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int N = s.length();
        s = s.toLowerCase();
        String bad = "!@$#%^&*()_ +=-{}[];:',<.>/|\\\"?";

        int i=0;
        int j = N-1;

        while(i < j){
            while(i<j && bad.contains(String.valueOf(s.charAt(i)))){
                i++;
            }
            while(i<j && bad.contains(String.valueOf(s.charAt(j)))){
                j--;
            }
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
