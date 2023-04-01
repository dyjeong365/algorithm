import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        List<Integer> queue = new ArrayList<>();

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    int input = Integer.parseInt(st.nextToken());
                    queue.add(input);
                    break;

                case "front":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.get(0) + "\n");
                    break;

                case "back":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.get(queue.size() - 1) + "\n");
                    break;

                case "size":
                    sb.append(queue.size() + "\n");
                    break;

                case "empty":
                    if (queue.isEmpty()) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;

                case "pop":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else {
                        sb.append(queue.get(0) + "\n");
                        queue.remove(0);
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
