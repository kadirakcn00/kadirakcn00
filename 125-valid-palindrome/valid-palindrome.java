class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        s = s.replaceAll("\\p{Punct}", "");
        if (s.isEmpty()) return true;
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);

    }
}