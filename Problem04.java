//443. String Compression
//https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int compress(char[] chars) {
        int index = 0, i = 0;
    while (i < chars.length) {
        char currentChar = chars[i];
        int count = 0;
        while (i < chars.length && chars[i] == currentChar) {
            i++;
            count++;
        }
        chars[index++] = currentChar;
        if (count != 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[index++] = c;
            }
        }
    }
    return index;
}
    
    
}
