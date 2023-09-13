import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0, count2 = 0, count3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i % one.length]) count1++;
            if(answers[i] == two[i % two.length]) count2++;
            if(answers[i] == three[i % three.length]) count3++;
        }
        
        int[] result = {count1, count2, count3};
        final int MAX = Arrays.stream(result).max().getAsInt();
        
        for(int i=0; i<result.length; i++){
            if(result[i] == MAX){
                answer.add(i+1);
            } 
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}