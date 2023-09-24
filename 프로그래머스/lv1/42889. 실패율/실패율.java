import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Double> failureRate = new ArrayList<>();
        
        for(int i=1; i<=N; i++){
            int numerator = 0;
            int denominator = 0;
            
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i) numerator++;
                if(stages[j] >= i) denominator++;
            }
            
            double result = (numerator == 0 || denominator == 0) ? 0 : (double)numerator / denominator;
            failureRate.add(result);
        }
        
        for(int i=0; i<failureRate.size(); i++){
            double max = failureRate.stream().mapToDouble(el -> el).max().getAsDouble();
            int indexOfMax = failureRate.indexOf(max);
            
            answer[i] = indexOfMax + 1;
            failureRate.set(indexOfMax, -1.0);
        }
        
        return answer;
    }
}