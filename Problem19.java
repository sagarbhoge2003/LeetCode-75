//724. Find Pivot Index
//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            if (leftsum * 2 == totalSum - nums[i])
                return i;  
        return -1;     
    }
}