//1431. Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0;
     for(int candy : candies){
        maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList();
        for(int candy : candies){
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
       
    }
}