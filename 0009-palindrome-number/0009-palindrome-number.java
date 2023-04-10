class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder(number);
        
        sb.reverse();
        return number.equals(sb.toString()) ? true : false;
    }
}