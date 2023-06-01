package JDBC.druid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//N皇后
public class Test {
    @org.junit.Test
    public void Test() {
        class Solution {
            //创建集合存储最后的结果
            List<List<String>> res = new ArrayList<>();
            //创建三个数组存储列，左斜对角线，右斜对角线是否含有皇后
            boolean[] usedCol, usedDiag45, usedDiag135;

            public List<List<String>> solveNQueens(int n) {
                usedCol = new boolean[n];
                usedDiag45 = new boolean[2 * n - 1];
                usedDiag135 = new boolean[2 * n - 1];
                //创建queue用来收集结果
                int[] queen = new int[n];
                backTracking(queen, n, 0);
                return res;
            }

            //回溯
            public void backTracking(int[] queen, int n, int row) {
                //如果遍历到叶子节点，说明有解
                if (row == n) {
                    List<String> temp = new ArrayList<>();
                    //遍历queue中每一列
                    for (int index : queen) {
                        char[] str = new char[n];
                        //把str数组中填满.
                        Arrays.fill(str, '.');
                        //找到每行中存储皇后的点，修改为Q
                        str[index] = 'Q';
                        //往集合中添加每个字符串
                        temp.add(new String(str));
                    }
                    //把每种结果都加入最后结果res中
                    res.add(temp);
                    return;
                }

                //如果还没遍历到叶子节点，则深度遍历加回溯
                for (int col = 0; col < n; col++) {
                    //如果列或45°斜线或135°斜线上有皇后，则遍历下一列
                    if (usedCol[col] || usedDiag45[col + row] || usedDiag135[row - col + n - 1]) {
                        continue;
                    }
                    //如果没有，则表示这一列可以放皇后,记录当前皇后存放的列的位置
                    queen[row] = col;
                    usedCol[col] = true;
                    usedDiag45[col + row] = true;
                    usedDiag135[row - col + n - 1] = true;
                    //遍历下一行
                    backTracking(queen, n, row + 1);
                    //回溯
                    usedCol[col] = false;
                    usedDiag45[col + row] = false;
                    usedDiag135[row - col + n - 1] = false;
                }
            }
        }
    }

}
