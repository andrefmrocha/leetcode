class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        Set<Integer> keys = map.keySet();
        if(keys.size() == 1){
            return keys.iterator().next();
        }
        return -1;
    }
}