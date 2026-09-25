class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] product=new int[n];
        int prefix=1;
        for(int i=0;i<n;i++){

            product[i]=prefix;
            prefix*=nums[i];            
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            
            product[i]*=suffix;
            suffix*=nums[i];
        }
        return product;
    }
}