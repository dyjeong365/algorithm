class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] symbols = { "I", "V", "X", "L", "C", "D", "M" };
        int[] values = { 1, 5, 10, 50, 100, 500, 1000 };

        for (int i = 0; i < symbols.length; i++) {
            map.put(symbols[i], values[i]);
        }

        Queue<String> queue = new LinkedList<>();
        int answer = 0;

        for (var el : s.split("")) {
            queue.offer(el);
        }

        while (!queue.isEmpty()) {
            String cur = queue.poll();

            if (!queue.isEmpty()) {
                String next = queue.peek();

                if (cur.equals("I")) {
                    if (next.equals("V") || next.equals("X")) {
                        answer += map.get(next) - map.get(cur);
                        queue.poll();
                        System.out.println("I: " + answer);
                    } else
                        answer += map.get(cur);
                }

                else if (cur.equals("X")) {
                    if (next.equals("L") || next.equals("C")) {
                        answer += map.get(next) - map.get(cur);
                        queue.poll();
                        System.out.println("X: " + answer);
                    } else
                        answer += map.get(cur);
                }

                else if (cur.equals("C")) {
                    if (next.equals("D") || next.equals("M")) {
                        answer += map.get(next) - map.get(cur);
                        System.out.println("C: " + answer);
                        queue.poll();
                    } else
                        answer += map.get(cur);
                } else
                    answer += map.get(cur);
            } else
                answer += map.get(cur);
        }

        return answer;
    }
}