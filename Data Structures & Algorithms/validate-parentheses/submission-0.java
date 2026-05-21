class Solution {
    public boolean isValid(String s) {
        char[] openingBrackets = new char[] {'(', '{', '['};
        char[] closingBrackets = new char[] {')', '}', ']'};

        Stack<Character> c = new Stack<>();

        char[] a = s.toCharArray();

        for(int i = 0; i < a.length; i++){
            if(c.size() == 0){
                for(int j = 0; j < closingBrackets.length; j++){
                    if(a[i] == closingBrackets[j]){
                        return false;
                    }
                }

                c.push(a[i]);
            }

            else{
                boolean isOpening = false;
                for(int k = 0; k < openingBrackets.length; k++){
                    if(a[i] == openingBrackets[k]){
                        c.push(a[i]);
                        isOpening = true;
                        break;
                    }
                }

                if (!isOpening) {
                    for(int l = 0; l < closingBrackets.length; l++){
                        if(a[i] == closingBrackets[l]){
                            if(c.pop() != openingBrackets[l]){
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return c.isEmpty();
    }
}
