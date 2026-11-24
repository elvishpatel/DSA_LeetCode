class Solution {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char temp = stack.pop();
                if (s.charAt(i) == ')' && temp != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && temp != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && temp != '[') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}