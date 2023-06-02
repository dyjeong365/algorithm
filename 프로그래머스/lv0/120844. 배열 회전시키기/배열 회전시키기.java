import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        final int LENGTH = numbers.length;
        
        return IntStream.range(0, numbers.length)
            .map(i -> direction.equals("left") 
                 ? numbers[(i+1) % LENGTH] 
                 : numbers[(i+LENGTH-1) % LENGTH])
            .toArray();
    }
}