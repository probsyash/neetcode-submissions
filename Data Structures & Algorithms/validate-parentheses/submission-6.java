class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>(Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
        ));

        Stack<Character> a = new Stack<>();
        char[] input = s.toCharArray();

        for(int i = 0; i < input.length; i++){
            if(brackets.containsKey(input[i])){
                a.push(input[i]);
            }
            else if(a.isEmpty() || brackets.get(a.pop()) != input[i]){
                return false;
                
            }
        }

        return a.isEmpty();
    }
}
