package a_easy;


/*
1337. The K Weakest Rows in a Matrix
Easy
Companies
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
The soldiers are positioned in front of the civilians.
 That is, all the 1's will appear to the left of all the 0's in each row.
A row i is weaker than a row j if one of the following is true:
1, The number of soldiers in row i is less than the number of soldiers in row j.
2, Both rows have the same number of soldiers and i < j.

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
Example 1:                                                                      Example 2:
Input: mat =                                                                        Input: mat =
[[1,1,0,0,0],                                                                       [[1,0,0,0],
 [1,1,1,1,0],                                                                        [1,1,1,1],
 [1,0,0,0,0],                                                                        [1,0,0,0],
 [1,1,0,0,0],                                                                        [1,0,0,0]],
 [1,1,1,1,1]],                                                                      k = 2
k = 3                                                                               Output: [0,2]
Output: [2,0,3]                                                                     Explanation:
Explanation:                                                                        The number of soldiers in each row is:
The number of soldiers in each row is:                                              - Row 0: 1
- Row 0: 2                                                                          - Row 1: 4
- Row 1: 4                                                                          - Row 2: 1
- Row 2: 1                                                                          - Row 3: 1
- Row 3: 2                                                                          The rows ordered from weakest to strongest are [0,2,3,1].
- Row 4: 5
The rows ordered from weakest to strongest are [2,0,3,1,4].


Input: mat =
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]],
k = 2
Output: [0,2]
Explanation:
The number of soldiers in each row is:
- Row 0: 1
- Row 1: 4
- Row 2: 1
- Row 3: 1
The rows ordered from weakest to strongest are [0,2,3,1].

Constraints:
m == mat.length
n == mat[i].length
2 <= n, m <= 100
1 <= k <= m
matrix[i][j] is either 0 or 1.
 */

public class A1337_The_K_Weakest_Rows_in_a_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1}};
        for (int ints : kWeakestRows(mat, 4)) {
            System.out.println(ints);
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        /*
        1,tạo chuỗi nhớ số lính tại mat[i][0]
        2, với mỗi số lượng lính, ta có một chuỗi lưu lần lượt các hàng theo thứ tự số lượng lính
         */
        int[] newarray = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }
            mat[i][0] = count;
        }

        int amount = 0;//lưu hàng theo thứ tự
        int soldiers = 0;
        boolean[] flag = new boolean[mat.length];
        //điều kiện tổng số lính nhỏ hơn số lượng phần tử
        while (soldiers <= mat[0].length && amount < k) {
            for (int i = 0; i < mat.length; i++) {
                if (flag[i]) continue;
                //lưu lần lượt hàng có số lính theo thứ tự
                if (mat[i][0] == soldiers && amount < k && !flag[i]) {
                    newarray[amount] = i;
                    flag[i] = true;
                    amount++;
                }
            }
            soldiers++;
        }
        return newarray;
    }
}
