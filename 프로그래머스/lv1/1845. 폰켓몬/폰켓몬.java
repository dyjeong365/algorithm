import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> numsSet = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        
        return Math.min(numsSet.size(), nums.length / 2);
    }
}