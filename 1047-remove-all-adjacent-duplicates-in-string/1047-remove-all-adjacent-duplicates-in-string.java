import java.util.*;


class Solution {
    public static void check(  Stack<Character> stack ){
        if(stack.isEmpty()){
            return;
        }
        char ch = stack.pop();
        if( !stack.isEmpty() && stack.peek() == ch ){
            stack.pop();
            check(stack);
        }
        else{
            stack.push(ch);
        }
    }
    public String removeDuplicates(String s) {
       Stack<Character> stack = new Stack<>();
       StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            stack.push(ch);
            check(stack);
        }

        while(!stack.isEmpty()){
            char ch = stack.pop();
            sb.append(ch);
        }
        String str = sb.reverse().toString();
        return str;
    }
}