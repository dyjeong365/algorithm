class Solution {
    public int romanToInt(String s) {
        final int LENGTH = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < LENGTH; i++) {
            int cur = map.get(s.charAt(i));
            int next = i == LENGTH - 1 ? Integer.MIN_VALUE : map.get(s.charAt(i + 1));

            answer = cur < next ? answer - cur : answer + cur;
        }

        return answer;
    }
}