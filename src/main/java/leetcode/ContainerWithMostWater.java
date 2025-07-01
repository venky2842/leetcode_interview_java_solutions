package leetcode;

/**
 * Container With Most Water
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn 
 * such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines, which, together with the x-axis forms a container, such that the 
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
    
    // Alternative solution using nested loops (less efficient)
    public int maxAreaBruteForce(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        
        int maxArea = 0;
        
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;
                
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
    }
} 