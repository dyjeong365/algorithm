/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start = 1;
        
        while(start <= n) {
            int half = (int)((start + n) / 2);
            int num = guess(half);
            
            if(num == 0) {
                return half;
            }
            
            if(num == -1) {
                n = half - 1;
            }
            
            if(num == 1) {
                start = half + 1;
            }
        }
        
        return -1;
    }
}