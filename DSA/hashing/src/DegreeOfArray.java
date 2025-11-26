// incorrect implementation
// 87 / 89 testcases passed
// fails for input : nums = [2,1,1,2,1,3,3,3,1,3,1,3,2]
// output: 10
// expected: 7

import java.util.HashMap;

class Solution {
    public int findShortestSubArray(int[] nums) {
        int N = nums.length;
        int target = nums[0];
        int maxFreq = 1;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<N; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if(freq.get(nums[i]) > maxFreq){
                maxFreq = freq.get(nums[i]);
                target = nums[i];
            }
        }

        int i = 0;
        int count = 0;
        boolean found = false;
        int remaining = maxFreq;
        while((i < N) && remaining != 0){
            if(found == false && nums[i] == target){
                found = true;
            }

            if(found){
                count++;
                if(nums[i] == target){
                    remaining--;
                }
            }
            i++;
        }
        return count;
    }
}