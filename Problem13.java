//1679. Max Number of K-Sum Pairs
//https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] < k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}