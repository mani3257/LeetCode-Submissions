class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;
        
        while (l < r) {
            while (l < r && !isVowel(ch[l])) {
                l++;
            }
            while (l < r && !isVowel(ch[r])) {
                r--;
            }
            
            if (l < r) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        
        return new String(ch);
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}