class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp=new HashMap<>();
        int n=strs.length;
        for(String i:strs){
            char[] c=i.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(i);
        }
        return new ArrayList<>(mp.values());
        
    }
}