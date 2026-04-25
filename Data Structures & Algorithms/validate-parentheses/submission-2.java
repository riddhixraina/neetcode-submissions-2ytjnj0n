class Solution {
    public boolean isValid(String s) {
    //     while (s.contains("()") || s.contains("{}") || s.contains("[]")){
    //         s = s.replace("()", "");
    //         s = s.replace("{}", "");
    //         s = s.replace("[]", "");
    //     }
    //     return s.isEmpty();

    Map<Character, Character> map = new HashMap<>();
    Stack<Character> stack = new Stack<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    for(char c : s.toCharArray()){
        if(map.containsKey(c)){
            if(!stack.isEmpty() && stack.peek() == map.get(c)){
                stack.pop();
            }
            else {
                return false;
            }
        }
        else{
            stack.push(c);
        }
    }
    return stack.isEmpty();
    }
}
