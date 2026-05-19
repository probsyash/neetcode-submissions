class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\p{P}\\s]+", "").toLowerCase();

        char[] a = s.toCharArray();
        char[] reverse = new char[a.length];
        for(int i = 0; i < a.length; i++){
            reverse[a.length - 1 - i] = a[i];
        }

        if(Arrays.equals(a,reverse)) return true;

        return false;
    }
}
