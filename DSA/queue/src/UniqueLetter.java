import java.util.*;

public class UniqueLetter {
    public String solve(String A) {
        int N = A.length();
        Deque<Character> dq = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            char ch = A.charAt(i);
            if(set.contains(ch)){
                while(!dq.isEmpty() && dq.peekLast() != ch){
                    stack.push(dq.pollLast());
                }
                dq.pollLast();
                while(!stack.empty()){
                    dq.offerLast(stack.pop());
                }
            }
            else{
                set.add(ch);
                dq.addLast(ch);
            }
            if(dq.isEmpty()){
                sb.append('#');
            }
            else{
                sb.append(dq.peekFirst());
            }
        }
        return sb.toString();
    }
}
