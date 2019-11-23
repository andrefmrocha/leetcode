import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char character : s.toCharArray()) {
            if(map.containsKey(character))
                map.put(character, map.get(character) + 1);
            else
                map.put(character, 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}