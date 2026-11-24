class Solution {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && stack.isEmpty() == false ){
                char temp = stack.pop();
                if(s.charAt(i) == ')' && temp != '('){
                    return false;
                }else if(s.charAt(i) == '}' && temp != '{'){
                    return false;
                }else if(s.charAt(i) == ']' && temp != '['){
                    return false;
                }
            }else{
            stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}