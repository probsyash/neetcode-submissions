class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for(int i = a.length - 1; i >= 0; i--){
            b[i] = a[(a.length - 1) - i];
        }

        return Arrays.equals(a,b);
    }
}
