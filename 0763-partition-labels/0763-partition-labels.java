class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int n=s.length();
        int[] a=new int[26];
        //store last index of each  char
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']=i;
        }
        //int l=0,r=0;
       int start=0,end=0;
       for(int i=0;i<n;i++){
        end=Math.max(end,a[s.charAt(i)-'a']);//store max index char
        //if i at max indexed char then make partion and update strt position for new window
        if(i==end){
            res.add(end-start+1);
            start=i+1;
        }
       }
       return res;

    }
}