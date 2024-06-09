//238. Product of Array Except Self
//https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] productExceptSelf(int[] arr) {
         int[] left= new int[arr.length];
            int[] right=new int[arr.length];
            left[0]=1;
            for(int i=1; i< arr.length; i++)
            {
                left[i]=left[i-1]*arr[i-1];
            }
            right[arr.length-1]=1;
            for(int i=arr.length-2; i>=0;i--)
            {
                right[i]=right[i+1]*arr[i+1];
            }
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=left[i]*right[i];
            }
        return arr;
    }
}