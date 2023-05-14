class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        while(1 < k){
            index += 2;
            k--;
        }
        index %= numbers.length;
        return numbers[index];
    }
}