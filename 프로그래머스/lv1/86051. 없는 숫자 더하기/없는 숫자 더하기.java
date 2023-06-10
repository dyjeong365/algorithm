import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> numberList = new LinkedList<>();
        
        for(int i=0; i<=9; i++){
            numberList.add(i);
        }
        
        for(Integer number : numbers){
            numberList.remove(number);
        }
        
        return numberList.stream().mapToInt(i -> i).sum();
    }
}