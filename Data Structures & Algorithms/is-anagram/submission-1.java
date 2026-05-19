class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] original = s.toCharArray();
        char[] matchcase = t.toCharArray();

        Arrays.sort(original);
        Arrays.sort(matchcase);

        return Arrays.equals(original,matchcase);
    }
}
