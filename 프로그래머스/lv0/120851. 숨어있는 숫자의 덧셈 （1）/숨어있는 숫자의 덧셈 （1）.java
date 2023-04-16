class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i=0; i<my_string.length(); i++){
            
            // char 변수에 저장된 유니코드를 확인 하려면 char 타입 변수를 int 타입 변수에 저장
            int uniCode = my_string.charAt(i);
            
            if(uniCode < 65){
                
                /**  
                 * 유니코드 값이 아닌 숫자 본연의 값을 구해야 한다. 
                 * 예를들어 char: '1' -> int: 1    
                 */
                answer = answer + Character.getNumericValue(uniCode);   
            }
        }
        return answer;
    }
}