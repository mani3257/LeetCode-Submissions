class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        int l = 0, r = n - 1;
        
        while (l < r) {
            char lv = ch[l], rv = ch[r];
            
            // Check if both left and right characters are vowels
            boolean isLeftVowel = (lv == 'a' || lv == 'A' || lv == 'e' || lv == 'E' || lv == 'i' || lv == 'I' || lv == 'o' || lv == 'O' || lv == 'u' || lv == 'U');
            boolean isRightVowel = (rv == 'a' || rv == 'A' || rv == 'e' || rv == 'E' || rv == 'i' || rv == 'I' || rv == 'o' || rv == 'O' || rv == 'u' || rv == 'U');
            
            if (isLeftVowel && isRightVowel) {
                // Swap characters in the array
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            } else {
                // If left is not a vowel, move left pointer forward
                if (!isLeftVowel) {
                    l++;
                }
                // If right is not a vowel, move right pointer backward
                if (!isRightVowel) {
                    r--;
                }
            }
        }
        
        return new String(ch);
    }
}
