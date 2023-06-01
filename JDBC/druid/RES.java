package JDBC.druid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RES {
    // 方法2：使用boolean数组表示已经占用的直(斜)线
    class Solution {
        List<List<String>> res = new ArrayList<>();
        boolean[] usedCol, usedDiag45, usedDiag135;    // boolean数组中的每个元素代表一条直(斜)线
        public List<List<String>> solveNQueens(int n) {
            usedCol = new boolean[n];                  // 列方向的直线条数为 n
            usedDiag45 = new boolean[2 * n - 1];       // 45°方向的斜线条数为 2 * n - 1
            usedDiag135 = new boolean[2 * n - 1];      // 135°方向的斜线条数为 2 * n - 1
            //用于收集结果, 元素的index表示棋盘的row，元素的value代表棋盘的column
            int[] board = new int[n];
            backTracking(board, n, 0);
            return res;
        }
        private void backTracking(int[] board, int n, int row) {
            if (row == n) {
                //收集结果
                List<String> temp = new ArrayList<>();
                for (int i : board) {
                    char[] str = new char[n];
                    Arrays.fill(str, '.');
                    str[i] = 'Q';
                    temp.add(new String(str));
                }
                res.add(temp);
                return;
            }

            for (int col = 0; col < n; col++) {
                if (usedCol[col] | usedDiag45[row + col] | usedDiag135[row - col + n - 1]) {
                    continue;
                }
                board[row] = col;
                // 标记该列出现过
                usedCol[col] = true;
                // 同一45°斜线上元素的row + col为定值, 且各不相同
                usedDiag45[row + col] = true;
                // 同一135°斜线上元素row - col为定值, 且各不相同
                // row - col 值有正有负, 加 n - 1 是为了对齐零点
                usedDiag135[row - col + n - 1] = true;
                // 递归
                backTracking(board, n, row + 1);
                usedCol[col] = false;
                usedDiag45[row + col] = false;
                usedDiag135[row - col + n - 1] = false;
            }
        }
    }
}
