package leetcode;

import java.util.*;

public class ThreeSum {
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Sort the array first, then use two pointers to find the three numbers that sum to 0
    // If the sum is less than 0, move the left pointer to the right
    // If the sum is greater than 0, move the right pointer to the left
    // If the sum is equal to 0, add the three numbers to the result list
    // Skip duplicate numbers
    // Return the result list
    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;
    }
}
