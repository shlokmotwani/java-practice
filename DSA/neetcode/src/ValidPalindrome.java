public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String bad = "!@$#%^&*()_ +=-{}[];:',<.>/|\\\"?";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(!bad.contains(String.valueOf(curr))){
                sb.append(String.valueOf(curr));
            }
        }
        String str = sb.toString();
        int N = str.length();
        int i=0;
        int j = N-1;

        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
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
