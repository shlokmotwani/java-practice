import java.util.HashMap;
import java.util.Stack;

public class MaxFrequencyStack {
    public static void fun(int[][] input){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashMap<Integer, Stack<Integer>> stackMap = new HashMap<>();

        int maxFreq = 0;
        for(int i=0; i<input.length; i++){
            int type = input[i][0];
            int val = input[i][1];
            if(type == 1){ // push
                int freq = freqMap.getOrDefault(val, 0);
                freqMap.put(val, ++freq);
                maxFreq = Math.max(maxFreq, freq);
                if(stackMap.containsKey(freq)){
                    Stack<Integer> st = stackMap.get(freq);
                    st.push(val);
                }
                else{
                    Stack<Integer> st = new Stack();
                    st.push(val);
                    stackMap.put(freq, st);
                }
            }
            else{ // pop
                Stack<Integer> st = stackMap.get(maxFreq);
                int value = st.pop();
                freqMap.put(value, freqMap.get(value) - 1);
                if(st.isEmpty()){
                    maxFreq--;
                }
                System.out.print(value + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] input = new int[12][2];
        input[0] = new int[]{1, 5};
        input[1] = new int[]{1, 7};
        input[2] = new int[]{1, 5};
        input[3] = new int[]{1, 7};
        input[4] = new int[]{1, 4};
        input[5] = new int[]{1, 5};
        input[6] = new int[]{2, 0};
        input[7] = new int[]{2, 0};
        input[8] = new int[]{2, 0};
        input[9] = new int[]{2, 0};
        input[8] = new int[]{2, 0};
        input[9] = new int[]{2, 0};

        fun(input);
    }
}
