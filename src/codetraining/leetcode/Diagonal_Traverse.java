package codetraining.leetcode;


public class Diagonal_Traverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int k = 0;

        int row = 0, col = 0;
        boolean up = true;

        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n - 1) {
                    result[k++] = mat[row][col];
                    row--;
                    col++;
                }
                result[k++] = mat[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (col > 0 && row < m - 1) {
                    result[k++] = mat[row][col];
                    row++;
                    col--;
                }
                result[k++] = mat[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }

        return result;
    }

    public static void main(String[] args) {
        Diagonal_Traverse solver = new Diagonal_Traverse();

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result1 = solver.findDiagonalOrder(mat1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[][] mat2 = {
                {1, 2},
                {3, 4}
        };
        int[] result2 = solver.findDiagonalOrder(mat2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}

