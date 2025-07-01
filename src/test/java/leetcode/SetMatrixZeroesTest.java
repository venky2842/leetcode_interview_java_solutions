package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SetMatrixZeroesTest {
    
    // Helper method to compare two 2D arrays
    private static boolean compareArrays(int[][] expected, int[][] actual) {
        if (expected.length != actual.length) return false;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].length != actual[i].length) return false;
            for (int j = 0; j < expected[i].length; j++) {
                if (expected[i][j] != actual[i][j]) return false;
            }
        }
        return true;
    }
    
    
    @Test
    public void testBasicCase() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testAllZeros() {
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testNoZeros() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testSingleElementZero() {
        int[][] matrix = {{0}};
        int[][] expected = {{0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testSingleElementNonZero() {
        int[][] matrix = {{5}};
        int[][] expected = {{5}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testFirstRowAllZeros() {
        int[][] matrix = {{0, 0, 0}, {1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testFirstColumnAllZeros() {
        int[][] matrix = {{0, 1, 2}, {0, 3, 4}, {0, 5, 6}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testLastRowAllZeros() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testLastColumnAllZeros() {
        int[][] matrix = {{1, 2, 0}, {3, 4, 0}, {5, 6, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testMultipleZerosInSameRow() {
        int[][] matrix = {{1, 0, 1, 0}, {2, 3, 4, 5}, {6, 7, 8, 9}};
        int[][] expected = {{0, 0, 0, 0}, {2, 0, 4, 0}, {6, 0, 8, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testMultipleZerosInSameColumn() {
        int[][] matrix = {{1, 2, 3}, {0, 4, 5}, {0, 6, 7}};
        int[][] expected = {{0, 2, 3}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosInCorners() {
        int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, 7, 0}};
        int[][] expected = {{0, 0, 0}, {0, 4, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosInCenter() {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        int[][] expected = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testLargeMatrix() {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 0, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 0},
            {21, 22, 23, 24, 25}
        };
        int[][] expected = {
            {1, 2, 0, 4, 0},
            {0, 0, 0, 0, 0},
            {11, 12, 0, 14, 0},
            {0, 0, 0, 0, 0},
            {21, 22, 0, 24, 0}
        };
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testRectangularMatrix() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 7, 8}, {9, 10, 11, 12}};
        int[][] expected = {{1, 0, 3, 4}, {0, 0, 0, 0}, {9, 0, 11, 12}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testTallMatrix() {
        int[][] matrix = {{1, 2}, {3, 4}, {0, 6}, {7, 8}};
        int[][] expected = {{0, 2}, {0, 4}, {0, 0}, {0, 8}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testWideMatrix() {
        int[][] matrix = {{1, 2, 3, 4, 5, 6}, {7, 8, 0, 10, 11, 12}};
        int[][] expected = {{1, 2, 0, 4, 5, 6}, {0, 0, 0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testNegativeNumbers() {
        int[][] matrix = {{-1, -2, -3}, {-4, 0, -6}, {-7, -8, -9}};
        int[][] expected = {{-1, 0, -3}, {0, 0, 0}, {-7, 0, -9}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testMixedPositiveNegative() {
        int[][] matrix = {{1, -2, 3}, {-4, 0, 6}, {7, -8, 9}};
        int[][] expected = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCross() {
        int[][] matrix = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingL() {
        int[][] matrix = {{0, 1, 1}, {0, 1, 1}, {0, 0, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingT() {
        int[][] matrix = {{0, 0, 0}, {1, 0, 1}, {1, 0, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingU() {
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingH() {
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingPlus() {
        int[][] matrix = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingX() {
        int[][] matrix = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingZigzag() {
        int[][] matrix = {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCheckerboard() {
        int[][] matrix = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingBorder() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingInnerSquare() {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[][] expected = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingDiagonal() {
        int[][] matrix = {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingAntiDiagonal() {
        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 1, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingSpiral() {
        int[][] matrix = {{0, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingRandomPattern() {
        int[][] matrix = {{1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}};
        int[][] expected = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingAlternatingRows() {
        int[][] matrix = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingAlternatingColumns() {
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCross() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCornerSquare() {
        int[][] matrix = {{0, 0, 1}, {0, 0, 1}, {1, 1, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterSquare() {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[][] expected = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithGaps() {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        int[][] expected = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZeros() {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};
        int[][] expected = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInCorners() {
        int[][] matrix = {{0, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 1, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInEdges() {
        int[][] matrix = {{1, 0, 1, 1}, {0, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInMiddle() {
        int[][] matrix = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[][] expected = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInCornersAndEdges() {
        int[][] matrix = {{0, 0, 1, 0}, {0, 0, 1, 0}, {1, 1, 0, 1}, {0, 0, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInCornersAndMiddle() {
        int[][] matrix = {{0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}, {0, 1, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInEdgesAndMiddle() {
        int[][] matrix = {{1, 0, 1, 1}, {0, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
    
    @Test
    public void testZerosFormingCenterCrossWithExtraZerosInCornersEdgesAndMiddle() {
        int[][] matrix = {{0, 0, 1, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}, {0, 0, 1, 0}};
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        SetMatrixZeroes.setZeroes(matrix);
        assertTrue(compareArrays(expected, matrix));
    }
} 