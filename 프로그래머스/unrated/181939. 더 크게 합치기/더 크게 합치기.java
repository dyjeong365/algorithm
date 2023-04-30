class Solution {
    public int solution(int a, int b) {
        String op = "";
        String reversedOp = "";
        
        op = "" + a + b;
        reversedOp = "" + b + a;
          
        return Math.max(Integer.parseInt(op), Integer.parseInt(reversedOp));
    }
}