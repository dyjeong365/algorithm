import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> difficultyLevels = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            difficultyLevels.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(difficultyLevels);

        int exclusionCount = (int) Math.round(n * 0.15);

        difficultyLevels = difficultyLevels.subList(exclusionCount, n - exclusionCount);

        int sum = 0;

        for (var level : difficultyLevels) {
            sum += level;
        }

        int result = (int) Math.round((double) sum / difficultyLevels.size());

        System.out.print(result);
    }
}
