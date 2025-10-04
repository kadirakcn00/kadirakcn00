class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reverseStr)){
            return true;
        }
        else{
            return false;
        }
    }
}