class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] resultArr = new int[n];

        resultArr[0] =1;

        for(int i =1 ;i< n;i++){
            resultArr[i] = resultArr[i-1] * nums[i-1];
        }

        int suf =1;
        for(int j=n-1;j>=0;j--){
            resultArr[j] = resultArr[j] * suf;
            suf *= nums[j];
        }

        return resultArr;
    }
}