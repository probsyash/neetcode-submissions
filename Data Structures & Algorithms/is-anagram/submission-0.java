class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        boolean[] used = new boolean[t.length()];  

        for (int i = 0; i < s.length(); i++) {
            boolean foundMatch = false;

            for (int j = 0; j < t.length(); j++) {
                if (!used[j] && s.charAt(i) == t.charAt(j)) {
                    used[j] = true;  
                    foundMatch = true;
                    break;
                }
            }

            if (!foundMatch) {
                return false; 
            }
        }

        return true;
    }
}
