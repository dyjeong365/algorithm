import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        List<Integer> integerList = new ArrayList<>();
        int minDistance = 0;
        int n = 0;
        int[] streetTrees = new int[N];

        for (int i = 0; i < N; i++) {
            streetTrees[i] = Integer.parseInt(br.readLine());

            if (i > 0) {
                integerList.add(streetTrees[i] - streetTrees[i - 1]);
            }
        }

        final int MIN = integerList.stream().mapToInt(Integer::intValue).min().getAsInt();

        for (int i = MIN; i > 0; i--) {
            boolean flag = true;

            for (int el : integerList) {
                if (el % i != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                minDistance = i;
                break;
            }
        }

        n = ((streetTrees[N - 1] - streetTrees[0]) / minDistance) + 1;
        System.out.println(n - streetTrees.length);
    }
}
