class Solution {
    public int solution(int num) {
        int count = 0;
        long longNum = num;
        
        if(num == 1) return 0;
        
        for (int i=0; i<500; i++){
            if(longNum == 1) return count;
            
            count++;
            longNum = longNum % 2 == 0 ? longNum/2 : longNum * 3 + 1;
        }
        return -1;
    }
}