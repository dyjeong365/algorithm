class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        
        for(int i=2; i<=Math.min(n, m); i++){
            if(n%i == 0 && m%i == 0){
                gcd = Math.max(gcd, i);
            }
        }
        int lcm = gcd * (n/gcd) * (m/gcd);
        
        return new int[]{gcd, lcm};
    }
}