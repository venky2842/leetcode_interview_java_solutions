package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ThreeSumTest {
    
    // Helper method to sort and compare lists
    private boolean compareLists(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) return false;
        
        // Sort both lists for comparison
        List<List<Integer>> sortedExpected = new ArrayList<>();
        for (List<Integer> list : expected) {
            List<Integer> sorted = new ArrayList<>(list);
            Collections.sort(sorted);
            sortedExpected.add(sorted);
        }
        Collections.sort(sortedExpected, (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i).compareTo(b.get(i));
                }
            }
            return Integer.compare(a.size(), b.size());
        });
        
        List<List<Integer>> sortedActual = new ArrayList<>();
        for (List<Integer> list : actual) {
            List<Integer> sorted = new ArrayList<>(list);
            Collections.sort(sorted);
            sortedActual.add(sorted);
        }
        Collections.sort(sortedActual, (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i).compareTo(b.get(i));
                }
            }
            return Integer.compare(a.size(), b.size());
        });
        
        return sortedExpected.equals(sortedActual);
    }
    
    
    @Test
    public void testBasicCase() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, -1, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testLessThanThreeElements() {
        int[] nums = {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllSameNumber() {
        int[] nums = {1, 1, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testTwoZerosAndOneNumber() {
        int[] nums = {0, 0, 1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testTwoZerosAndNegativeNumber() {
        int[] nums = {0, 0, -1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testThreeZeros() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testOneZeroAndTwoOppositeNumbers() {
        int[] nums = {0, 1, -1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testMultipleSolutions() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, -1, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testDuplicateNumbers() {
        int[] nums = {-1, -1, -1, 0, 1, 1, 1};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, -1000000, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1000000, 0, 1000000));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testSmallNumbers() {
        int[] nums = {-1, -1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testMixedPositiveNegative() {
        int[] nums = {-2, -1, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testConsecutiveNumbers() {
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAlternatingNumbers() {
        int[] nums = {-2, 2, -1, 1, 0};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testReversedOrder() {
        int[] nums = {3, 2, 1, 0, -1, -2, -3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testRandomOrder() {
        int[] nums = {1, -2, 0, 3, -1, 2, -3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testManyDuplicates() {
        int[] nums = {-1, -1, -1, -1, 0, 0, 0, 1, 1, 1, 1};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, 0, 1),
            Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllSameExceptOne() {
        int[] nums = {1, 1, 1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testAllSameExceptTwo() {
        int[] nums = {1, 1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testThreeDifferentNumbers() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testThreeNumbersThatSumToZero() {
        int[] nums = {1, -2, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, 1, 1));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testFourNumbers() {
        int[] nums = {1, -1, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testFiveNumbers() {
        int[] nums = {1, -1, 0, 2, -2};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testSixNumbers() {
        int[] nums = {1, -1, 0, 2, -2, 3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testSevenNumbers() {
        int[] nums = {1, -1, 0, 2, -2, 3, -3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testEightNumbers() {
        int[] nums = {1, -1, 0, 2, -2, 3, -3, 4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, -1, 4),
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testNineNumbers() {
        int[] nums = {1, -1, 0, 2, -2, 3, -3, 4, -4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-4, 0, 4),
            Arrays.asList(-4, 1, 3),
            Arrays.asList(-3, -1, 4),
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testTenNumbers() {
        int[] nums = {1, -1, 0, 2, -2, 3, -3, 4, -4, 5};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-4, -1, 5),
            Arrays.asList(-4, 0, 4),
            Arrays.asList(-4, 1, 3),
            Arrays.asList(-3, -2, 5),
            Arrays.asList(-3, -1, 4),
            Arrays.asList(-3, 0, 3),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-2, -1, 3),
            Arrays.asList(-2, 0, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testLargeArray() {
        int[] nums = new int[100];
        for (int i = 0; i < 50; i++) {
            nums[i] = i;
            nums[i + 50] = -i;
        }
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        // For large arrays, we just check that the result is not null and doesn't crash
        assertNotNull(result);
    }
    
    @Test
    public void testVeryLargeNumbers() {
        int[] nums = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testOverflowCase() {
        int[] nums = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testUnderflowCase() {
        int[] nums = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testBoundaryValues() {
        int[] nums = {Integer.MAX_VALUE - 1, Integer.MIN_VALUE + 1, 0};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
    
    @Test
    public void testOriginalExample() {
        int[] nums = {-3, 0, 1, 2, 7, -4, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-4, -3, 7),
            Arrays.asList(-3, 1, 2),
            Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        assertTrue(compareLists(expected, result));
    }
} 