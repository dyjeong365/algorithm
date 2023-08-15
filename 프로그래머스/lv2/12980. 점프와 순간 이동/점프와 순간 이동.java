public class Solution {
    public int solution(int n) {
        final int BINARY_NUMBER = Integer.parseInt(Integer.toBinaryString(n), 2);
        
        return Integer.bitCount(BINARY_NUMBER);
    }
}