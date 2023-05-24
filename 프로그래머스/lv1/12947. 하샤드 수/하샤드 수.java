class Solution {
    public boolean solution(int x) {
        char[] splitedX = String.valueOf(x).toCharArray();
        int sum = 0;
        
        for(var el : splitedX){
            sum += Integer.parseInt(String.valueOf(el));
        }
        return x % sum == 0 ? true : false;
    }
}