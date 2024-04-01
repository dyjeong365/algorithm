class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];

        for(var el : s.toCharArray()) {
            ++count[el - 'a'];
        }

        for(var el : t.toCharArray()) {
            if(count[el - 'a'] == 0) {
                return el;
            }

            --count[el - 'a'];
        }

        return ' ';
    }
}