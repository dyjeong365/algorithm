import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        List<Integer> queue = new LinkedList<>();

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else {
                        sb.append(queue.get(0) + "\n");
                        queue.remove(0);
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.get(0) + "\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.get(queue.size() - 1) + "\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
