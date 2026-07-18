// this ans shows TLE
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int ans = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             int currSum = 0;

//             for (int j = i; j < n; j++) {
//                 currSum += nums[j];
//                 ans = Math.max(ans, currSum);
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
      int currSum=0;
       int maxSum = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        currSum +=nums[i];
        maxSum=Math.max(maxSum,currSum);
        if(currSum<0){
            currSum=0;
        }
      }

        return maxSum;
    }
}