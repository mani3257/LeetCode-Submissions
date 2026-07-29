class Solution {
    public int characterReplacement(String s, int k) { 
        int n=s.length();
        int[] freq=new int[26];// to store the frequency of each char
        int maxFreq=0;
        int maxLength=0;
        for(int left=0,right=0;right<n;right++){// keep moving right to expand window until condition fails,if it fails move left to shrink
            freq[s.charAt(right)-'A']++;//check each char freq and store at respective index
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);//check th max freq of chars
            while((right-left+1)-maxFreq>k){// if condition fails
                freq[s.charAt(left)-'A']--;//decrese/remove the freq of char from left, ..edit
                left++;// move left pointer to shrink window                
            }
            maxLength=Math.max(maxLength,right-left+1);//update the max Length of window that canot voilets the condition(maxLen-maxFreq<=k)
        }
        return maxLength;        
    }
}