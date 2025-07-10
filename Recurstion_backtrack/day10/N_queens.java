package Recurstion_backtrack.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_queens {
    class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        int cols=0;
        int rdiag=0;
        int ndiag=0;
        solve(board,0,cols,ndiag,rdiag,new ArrayList<>(),ans);
        return ans;
         
    }

    public void solve(boolean[][] board, int row, int cols, int ndiag, int rdiag, List<String> current, List<List<String>> ans)
    {
        int n=board.length;
        if(row==board.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(
                ((cols & (1<<col))==0 ) &&
                ((ndiag & (1<<(row+col)))==0) &&
                ((rdiag & (1<<(row-col+board.length-1)))==0)
            )
            {
                board[row][col]=true;
                cols ^= (1 << col);
                ndiag ^= (1<<(row+col));
                rdiag ^= (1<<(row-col+board.length-1));

                char[] rowStr = new char[n];
                Arrays.fill(rowStr, '.');
                rowStr[col]='Q';
                current.add(new String(rowStr));

               
                solve(board, row+1, cols, ndiag, rdiag, current,ans);
                
                current.remove(current.size()-1);
                cols ^= (1 << col);
                ndiag ^= (1<<(row+col));
                rdiag ^= (1<<(row-col+board.length-1));
                board[row][col]=false;
            }
        }
    }
}
    
}
