import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        final int LENGTH1 = arr1.length;
        final int LENGTH2 = arr1.length;
        
        if(LENGTH1 > LENGTH2) return 1;
        else if(LENGTH1 < LENGTH2) return -1;
        else{
            final int SUM1 = Arrays.stream(arr1).sum();
            final int SUM2 = Arrays.stream(arr2).sum();
            
            if(SUM1 > SUM2) return 1;
            else if(SUM1 < SUM2) return -1;
            else return 0;
        } 
    }
}