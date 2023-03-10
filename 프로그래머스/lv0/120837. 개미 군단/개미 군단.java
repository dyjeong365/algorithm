class Solution {
    public int solution(int hp) {
        final int KING = 5;
        final int MAJOR = 3;
        final int WORKER = 1;
        
        return (hp / KING) + ((hp % KING) / MAJOR) + ((hp % KING) % MAJOR);
    }
}