import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> set = new HashMap();
        for(int i = 0; i < nums1.length; i++){
            if(set.containsKey(nums1[i]))
                set.put(nums1[i], set.get(nums1[i]) + 1);
            else 
                set.put(nums1[i], 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){

            Integer value = set.get(nums2[i]);
            if(value != null && value > 0){
                list.add(nums2[i]);
                set.put(nums2[i], value - 1);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}