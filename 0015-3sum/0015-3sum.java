class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;//skip 'i' dupicates
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;

                }else if(sum>0)k--;
                else{
                    ls.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                   // k--;
                    while(j<k && nums[j]==nums[j-1])j++;//skip 'j' duplicates
                    while(j<k && nums[k]==nums[k-1])k--;// skip 'k' duplicates
                }

            }
        }
        return ls;
        
    }
}