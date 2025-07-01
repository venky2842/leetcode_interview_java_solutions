package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    
    @Test
    public void testBasicCase() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "abcabcbb";
        int expected = 3; // "abc"
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testAllSameCharacters() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "bbbbb";
        int expected = 1; // "b"
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testAllDifferentCharacters() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "pwwkew";
        int expected = 3; // "wke"
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testEmptyString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "";
        int expected = 0;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testNullString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = null;
        int expected = 0;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testSingleCharacter() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "a";
        int expected = 1;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testTwoCharacters() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "ab";
        int expected = 2;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testRepeatingAtEnd() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "abcabc";
        int expected = 3; // "abc"
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testRepeatingAtStart() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "aabcabc";
        int expected = 3; // "abc", "bca", or "cab"
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testLongString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "abcdefghijklmnopqrstuvwxyz";
        int expected = 26;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
    
    @Test
    public void testSpecialCharacters() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        
        String s = "!@#$%^&*()";
        int expected = 10;
        
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstringArray(s));
    }
} 