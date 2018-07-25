package com.tz.offor;

/**
 * create by tz on 2018-07-24
 */
/**
 * 题目描述
 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * */


public class hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (searchFormHere(matrix, rows, cols, i, j, 0, str, flag))
                    return true;
            }
        }
        return false;
    }


    public boolean searchFormHere(char[] matrix, int rows, int cols, int r, int c, int index, char[] str, boolean[] flag) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || matrix[r * cols + c] != str[index]|| flag[r * cols + c]) {
            return false;
        }
        if (index == str.length - 1) {
            return true;
        }
        if (searchFormHere(matrix,rows,cols,r - 1,c,index + 1,str,flag)
                || searchFormHere(matrix,rows,cols,r,c -1,index + 1,str,flag)
                || searchFormHere(matrix,rows,cols,r + 1,c,index + 1,str,flag)
                || searchFormHere(matrix,rows,cols,r,c + 1,index + 1,str,flag)) {
            return true;
        }
        flag[r * cols + c] = false;
        return false;
    }




}
