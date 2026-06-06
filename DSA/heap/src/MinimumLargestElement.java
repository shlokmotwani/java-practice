import java.util.PriorityQueue;

public class MinimumLargestElement {
    public int solve(int[] A, int B) {
        int N = A.length;
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> (a.current + a.power) - (b.current + b.power));
        for(int num: A){
            q.add(new Pair(num, num));
        }
        int k = 1;
        while(k <= B){
            Pair pair = q.remove();
            pair.current += pair.power;
            q.add(pair);
            k++;
        }
        int maxNum = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair pair = q.remove();
            maxNum = Math.max(maxNum, pair.current);
        }
        return maxNum;
    }

    class Pair{
        int current;
        int power;

        Pair(int current, int power){
            this.current = current;
            this.power = power;
        }
    }
}
