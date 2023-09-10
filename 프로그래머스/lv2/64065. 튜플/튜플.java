import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        String[] splitedS = s.split("},");
        
        for(int i=0; i<splitedS.length; i++){
            splitedS[i] = splitedS[i].replace("{", "").replace("}","");
        }
        
        Arrays.sort(splitedS, Collections.reverseOrder((a, b) -> b.length() - a.length()));
        
        for(var each : splitedS){
            for(var element : each.split(",")){
                answer.add(Integer.parseInt(element));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).distinct().toArray();
    }
}