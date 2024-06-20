//1732. Find the Highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int largestAltitude(int[] gain) {
      int currentAltitude = 0;
      // Highest altitude currently is 0.
      int highestPoint = currentAltitude;
  
      for (int altitudeGain : gain) {
        // Adding the gain in altitude to the current altitude.
        currentAltitude += altitudeGain;
        // Update the highest altitude.
        highestPoint = Math.max(highestPoint, currentAltitude);
      }
  
      return highestPoint;
    }
  }