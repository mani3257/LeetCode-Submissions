class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n==1)return 0;
        int max_area=0;
        int left=0,right=n-1;
        while(left<right){
            int width=Math.abs(right-left);
            int ht=Math.min(height[left],height[right]);
            int area=ht*width;
            max_area=Math.max(max_area,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
        
    }
}