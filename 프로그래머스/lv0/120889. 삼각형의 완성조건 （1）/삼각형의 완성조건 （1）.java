class Solution {
    public int solution(int[] sides) {
        
        if((sides[0] >= sides[1]) && (sides[0] >= sides[2]) && (sides[0] < sides[1] + sides[2])) return 1; 
        else if((sides[1] >= sides[2]) && (sides[1] >= sides[0]) && (sides[1] < sides[0] + sides[2])) return 1;
        else if((sides[2] >= sides[1]) && (sides[2] >= sides[0]) && (sides[2] < sides[1] + sides[0])) return 1;
        return 2;
    }
}