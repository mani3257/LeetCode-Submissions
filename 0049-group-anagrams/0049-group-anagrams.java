class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        //List<String<String>>ls=new ArrayList<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!mp.containsKey(key)){
                 mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(strs[i]);

        }
        return new ArrayList<>(mp.values());
        
    }
}