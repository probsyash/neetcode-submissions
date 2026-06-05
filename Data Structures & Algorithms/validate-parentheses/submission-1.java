class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>(Map.of(
            '{', '}',
            '[', ']',
            '(', ')'
        ));

        Stack<Character> charStack = new Stack<>();

        char[] a = s.toCharArray();

        for(int i = 0; i < a.length; i++){
            if(brackets.containsKey(a[i])){
                charStack.push(a[i]);
            }
            else{
                if (charStack.isEmpty()) {
                    return false;
                }
                if(brackets.get(charStack.pop()) != a[i]){
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}
