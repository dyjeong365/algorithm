import java.util.*;

class Solution {
    public int solution(int[][] board) {
        Set<String> set = new HashSet<>();
        final int LENGTH = board.length;
        
        for(int x=0; x<LENGTH; x++) {
            for(int y=0; y<LENGTH; y++) {
                if(board[x][y] == 1) {
                    for(int i=x-1; i<=x+1; i++) {
                        for(int j=y-1; j<=y+1; j++) {
                            if(i>=0 && i<LENGTH && j>=0 && j<LENGTH) {
                                set.add(String.format("(%d,%d)", i, j));        
                            }
                        }
                    }
                }
            }
        }
        
        return LENGTH * LENGTH - set.size();
    }
}