class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            if (!deque.isEmpty() && deque.peekLast().equals(target)) {
                deque.pollLast();
            } else {
                deque.offerLast(target);
            }
        }

        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst());
        }

        return sb.toString();
    }
}