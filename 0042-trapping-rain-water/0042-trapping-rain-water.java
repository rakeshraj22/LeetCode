class Solution {
    public int trap(int[] height) {
        int[] leftArr = new int[height.length];
        int[] rightArr = new int[height.length];
        int ans = 0;
        int max =-1;
        for(int i = 0; i<height.length;i++){
            if(height[i] > max){
                max = height[i];
            }
            leftArr[i] = max;
        }

        max = -1;
        for(int i = height.length-1; i >=0 ;i--){
            max = Math.max(max,height[i]);
            rightArr[i] = max;
        }

        for(int i =0; i<height.length;i++){
            ans += Math.min(leftArr[i],rightArr[i]) - height[i];
        }
        return ans;


    }
}