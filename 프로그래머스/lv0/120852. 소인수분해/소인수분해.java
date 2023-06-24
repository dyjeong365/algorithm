import java.util.*;

class Solution {
    public int[] solution(int n) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int index = 2;
        
        while(index <= n){
            if(n % index == 0){
                treeSet.add(index);
                n/=index;
            }
            else index++;
        }
        return treeSet.stream().mapToInt(i -> i).toArray();
    }
}