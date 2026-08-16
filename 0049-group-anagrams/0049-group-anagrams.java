class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String i:strs){
            int[] f=new int[26];
            for(char c:i.toCharArray()){
                f[c-'a']++; // noted freq of each char in evry string
            }
            String key=Arrays.toString(f);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(i);
        }
        return new ArrayList<>(mp.values());
        
    }
}