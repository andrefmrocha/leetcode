import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' && chars.peek() == '(')
                chars.pop();
            else if(s.charAt(i) == '}' && chars.peek() == '{')
                chars.pop();
            else if(s.charAt(i) == ']' && chars.peek() == '[')
                chars.pop();
            else{
                chars.push(s.charAt(i));
            }
        }
    }
}