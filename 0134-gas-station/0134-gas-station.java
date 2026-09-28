class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0,totalgas=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalcost>totalgas)return -1;
        int start=0,cur_gas=0;
        for(int i=0;i<n;i++){
            cur_gas+=gas[i]-cost[i];
            if(cur_gas<0){
                cur_gas=0;
                start=i+1;
            }

        }
        return start;
        
    }
}