import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");

        final int N = Integer.parseInt(input[0]);
        final int M = Integer.parseInt(input[1]);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int length = word.length();

            if (length >= M) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        PriorityQueue<String> vocabularyBook = new PriorityQueue<>((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            } else if (a.length() != b.length()) {
                return b.length() - a.length();
            } else {
                return a.compareTo(b);
            }
        });

        for (String key : map.keySet()) {
            vocabularyBook.offer(key);
        }

        while (!vocabularyBook.isEmpty()) {
            sb.append(vocabularyBook.poll()).append("\n");
        }

        System.out.print(sb);
    }
}
