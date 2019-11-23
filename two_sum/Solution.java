import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];
            if(map.containsKey(neededValue)){
                return new int[]{
                    map.get(neededValue),
                    i
                };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}