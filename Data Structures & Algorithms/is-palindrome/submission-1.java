class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] a = s.toCharArray();
        char[] reversed = new char[a.length];

        for(int i = 0; i < reversed.length; i++){
            reversed[reversed.length - i - 1] = a[i];
        }

        for(int j = 0; j < a.length; j++){
            if(a[j] != reversed[j]){
                return false;
            }
        }

        return true;
    }
}