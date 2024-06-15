//643. Maximum Average Subarray I
//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res =-1111;
        int i=0;
        int j=0;
        double sum=0;
        while(j<=nums.length-1){
            sum+=nums[j];
            if(j-i+1==k){
                res=Math.max(res,(sum/k));
                sum-=nums[i++];
            }
            j++;
        }
        return res;
    }
}