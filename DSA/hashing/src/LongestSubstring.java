import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String A) {
        int N = A.length();
        int maxLen = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<N; i++){
            char ch = A.charAt(i);
            if(set.contains(ch)){
                while(A.charAt(j) != ch){
                    set.remove(A.charAt(j));
                    j++;
                }
                j++;
            }
            else{
                set.add(ch);
            }
            maxLen = Math.max(maxLen, i-j+1);
        }
        return maxLen;
    }
}
