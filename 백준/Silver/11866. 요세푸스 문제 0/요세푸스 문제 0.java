import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        List<Integer> list = new LinkedList<>();
        String[] input = br.readLine().split(" ");

        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            int indexOfK = (K - 1) % list.size();
            int valueOfIndexK = list.get(indexOfK);

            while (list.get(0) != valueOfIndexK) {
                list.add(list.remove(0));
            }

            sb.append(list.remove(0)).append(list.isEmpty() ? ">" : ", ");
        }

        System.out.println(sb);
    }
}
