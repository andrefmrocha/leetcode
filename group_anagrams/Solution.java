import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char array[] = string.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(key, list);
            } else {
                map.get(key).add(string);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}