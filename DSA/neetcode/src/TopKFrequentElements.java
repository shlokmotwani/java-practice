import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int N = nums.length;
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0; i<N; i++){
            q.add(new Pair(nums[i], map.getOrDefault(nums[i], 0)));
            map.remove(nums[i]);
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            Pair pair = q.remove();
            result[i] = pair.num;
        }
        return result;
    }

    class Pair{
        int num;
        int freq;

        Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
}
