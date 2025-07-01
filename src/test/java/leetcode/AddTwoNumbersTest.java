package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {
    
    @Test
    public void testBasicCase() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [2,4,3], l2 = [5,6,4]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{2, 4, 3});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{5, 6, 4});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {7, 0, 8};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testDifferentLengths() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{9, 9, 9, 9});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testSingleDigits() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [5], l2 = [5]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{5});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{5});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {0, 1};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testWithZero() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [0], l2 = [0]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{0});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{0});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {0};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testOneEmptyList() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [1,2,3], l2 = null
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode l2 = null;
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {1, 2, 3};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testLargeNumbers() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [9,9,9], l2 = [1]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{9, 9, 9});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{1});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {0, 0, 0, 1};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
    
    @Test
    public void testCarryOverMultipleDigits() {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // l1 = [9,9,9,9], l2 = [9,9,9,9]
        AddTwoNumbers.ListNode l1 = AddTwoNumbers.createList(new int[]{9, 9, 9, 9});
        AddTwoNumbers.ListNode l2 = AddTwoNumbers.createList(new int[]{9, 9, 9, 9});
        
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        int[] expected = {8, 9, 9, 9, 1};
        
        assertArrayEquals(expected, AddTwoNumbers.listToArray(result));
    }
} 