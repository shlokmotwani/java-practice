import java.util.ArrayList;
import java.util.HashMap;

public class FizzBuzz {
    public static ArrayList<String> fizzBuzz(int num){
        int[] divisors = {3, 5};
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        ArrayList<String> result = new ArrayList<>();

        for(int i=1; i<=num; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<divisors.length; j++){
                if(i%divisors[j] == 0){
                    sb.append(map.get(divisors[j]));
                }
            }
            if(sb.isEmpty()){
                sb.append(i);
            }

            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        ArrayList<String> res = fizzBuzz(n);

        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
