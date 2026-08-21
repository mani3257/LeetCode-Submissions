class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String r=new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}