package a_easy;

/*
1351. Count Negative Numbers in a Sorted Matrix
Easy
Companies
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

 Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100

Follow up: Could you find an O(n + m) solution?
 */
public class A1351_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {

    }
    public int countNegatives(int[][] grid) {
        int count =0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if(anInt<0) count ++;
            }
        }
        return count;
    }
}
