class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        while((max % 2 != 0) || (min + 1 != max)){
            min = (min + 1) / 2;
            max = (max + 1) / 2;
            round++;
        } 

        return round;
    }
}