//2215. Find the Difference of Two Arrays
//https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

          Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length || i < nums2.length; i++) {

            if (i < nums1.length) {
                set1.add(nums1[i]);
            }
            if (i < nums2.length) {
                set2.add(nums2[i]);
            }
        }

        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        List<List<Integer>> answer = new ArrayList<>();

        answer.add(new ArrayList<>(diff1));
        answer.add(new ArrayList<>(diff2));
        
        return answer;



    
    }
}