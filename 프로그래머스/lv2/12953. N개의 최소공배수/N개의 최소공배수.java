import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int share = 2;
        
        while(share <= 100){
            int count = 0;
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<arr.length; i++){
                if(arr[i] % share == 0){
                    count++;
                    list.add(i);
                }
            }
            if (count > 1){
                answer *= share;
                
                for(var el : list){
                    arr[el] /= share;
                }
            }
            else {
                share++;
            }
        }
        
        return answer *= Arrays.stream(arr).reduce(1, (a, b) -> a*b);
    }
}