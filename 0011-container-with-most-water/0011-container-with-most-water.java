class Solution {
    public int maxArea(int[] height) {
        int st =0;
        int end = height.length -1;
        int ans =-1;

        while(st < end){
            int temp = (end-st) * Math.min(height[st],height[end]) ;
            ans = Math.max(ans,temp);
            if(height[st] <= height[end]){
                st++;
            }else{
                end--;
            }
        }
        return ans;
    }
}