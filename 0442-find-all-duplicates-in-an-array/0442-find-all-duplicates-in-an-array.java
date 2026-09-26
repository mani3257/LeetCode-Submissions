class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //create a list to add duplicates
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
            //check if ele is -ve
            if(nums[index]<0){
                ls.add(index+1);
            }
            //if ele is vistes first make -ve mark to remember
            else{
                nums[index]=-nums[index];
            }
        }
        return ls;
    }
}