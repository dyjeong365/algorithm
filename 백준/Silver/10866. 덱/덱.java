import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        List<Integer> list = new LinkedList<>();
        final int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int value = 0;

            switch (order) {
                case "push_front":
                    value = Integer.parseInt(st.nextToken());
                    list.add(0, value);
                    break;
                case "push_back":
                    value = Integer.parseInt(st.nextToken());
                    list.add(value);
                    break;
                case "pop_front":
                    if (list.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        int indexOfFront = 0;
                        
                        sb.append(list.get(indexOfFront)).append("\n");
                        list.remove(indexOfFront);
                    }
                    break;
                case "pop_back":
                    if (list.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int indexOfBack = list.size() - 1;

                        sb.append(list.get(indexOfBack)).append("\n");
                        list.remove(indexOfBack);
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    sb.append(list.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(list.isEmpty() ? -1 : list.get(0)).append("\n");
                    break;
                case "back":
                    sb.append(list.isEmpty() ? -1 : list.get(list.size() - 1)).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
