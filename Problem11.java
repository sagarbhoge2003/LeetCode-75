//392. Is Subsequence
//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();        
    }
}