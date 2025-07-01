package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        // Test the failing case
        String s = "aabcabc";
        System.out.println("String: " + s);
        System.out.println("Result: " + solution.lengthOfLongestSubstring(s));
        System.out.println("Result (array): " + solution.lengthOfLongestSubstringArray(s));
        
        // Test with "bcab"
        String s2 = "bcab";
        System.out.println("String: " + s2);
        System.out.println("Result: " + solution.lengthOfLongestSubstring(s2));
    }
    
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                // Move start to the position after the last occurrence of currentChar
                start = charMap.get(currentChar) + 1;
            }
            
            charMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
    
    // Alternative solution using sliding window with array (faster for ASCII characters)
    public int lengthOfLongestSubstringArray(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] charIndex = new int[128]; // ASCII characters
        int maxLength = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            
            charIndex[currentChar] = end + 1;
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
} 