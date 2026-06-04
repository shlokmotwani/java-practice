import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = -1;
        int y = -1;
        for(int i=0; i<N; i++){
            int curr = nums[i];
            int required = target - curr;
            if(map.containsKey(required)){
                x = Math.min(i, map.get(required));
                y = Math.max(i, map.get(required));
                return new int[]{x, y};
            }
            else{
                map.put(curr, i);
            }
        }
        return new int[]{};
    }
}
