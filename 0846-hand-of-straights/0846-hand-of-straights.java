class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0)return false;
        TreeMap<Integer,Integer>mp=new TreeMap<>();

        for(int i=0;i<n;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
        }
        while(!mp.isEmpty()){
            int first=mp.firstKey();
            for(int i=0;i<groupSize;i++){
                int next=first+i;
                if(!mp.containsKey(next))return false;
                int count=mp.get(next);
                if(count==1)mp.remove(next);
                else mp.put(next,count-1);


            }
        }
        return true;
       
        
    }
}