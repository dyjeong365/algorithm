class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int count = 0;
        String copyOfS = s;
        
        while(true){
            zeroCount += copyOfS.chars().filter(i -> i == '0').count();
            
            int length = copyOfS.replace("0", "").length();
            StringBuilder binaryConversion = new StringBuilder();
            
            while(length > 1){
                int remainder = length % 2;
                
                binaryConversion.append(remainder);
                length /= 2;
            }
            
            binaryConversion.append(length);
            copyOfS = binaryConversion.reverse().toString();
            count++;
            
            if (copyOfS.equals("1")){
                return new int[]{count, zeroCount};
            }        
        }
    }
}