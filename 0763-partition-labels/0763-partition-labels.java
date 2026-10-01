class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ls=new ArrayList<>();
        int n=s.length();
        int[] a=new int[26];
        //store last index of each char
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']=i;
        }
        int start=0,end=0;
        for(int i=0;i<n;i++){
            end=Math.max(end,a[s.charAt(i)-'a']);
            if(i==end){

                ls.add(end-start+1);
                start=i+1;
            }
        }
        return ls;


        
    }
}