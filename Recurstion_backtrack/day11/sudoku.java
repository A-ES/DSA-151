package Recurstion_backtrack.day11;

public class sudoku {
    class Solution {
        public void solveSudoku(char[][] board) {
            solve(board);
            
        }
    
        private boolean solve(char[][] board){
            int n = board.length;
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='.'){
                        for(char c ='1'; c<='9';c++){
                            if(isValid(board,i,j,c)){
                                board[i][j]=c;
    
                                if (solve(board)) return true;
                                board[i][j] = '.'; // backtrack
    
                            }
                        }
                    return false;
                    }
                }
            }
            return true;
        }
    
        private boolean isValid(char[][] board, int row, int col, char c){
            for(int i=0;i<9;i++){
                if(board[i][col]==c) return false;//colums
                if(board[row][i]==c)return false;//rows
                if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
        return false;
    
    
    
            }
            return true;
        }
    }
}
