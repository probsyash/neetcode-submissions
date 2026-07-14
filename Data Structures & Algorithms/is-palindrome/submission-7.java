class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for(int i = 0; i < a.length; i++){
            b[i] = a[a.length - i - 1];
        }

        return Arrays.equals(a,b);
    }
}
