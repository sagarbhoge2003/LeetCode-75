//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
//151. Reverse Words in a String
public class Problem03 {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();
        
        // Reverse the order of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
