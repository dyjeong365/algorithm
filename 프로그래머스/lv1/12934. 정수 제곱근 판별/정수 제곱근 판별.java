class Solution {
    public long solution(long n) {
        long operation = 0L;
        int base = 1;
        
        while(operation < n){
            operation = (long)Math.pow(base++, 2);
            if(operation == n) return (long)Math.pow(base, 2);
        }
        return -1;
    }
}