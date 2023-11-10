import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] triangles = new String[1000][];

        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = br.readLine().split(" ");

            String side = triangles[i][0];
            if (side.equals("0")) break;

            long count = Arrays.stream(triangles[i]).distinct().count();
            int max = Arrays.stream(triangles[i]).mapToInt(Integer::parseInt).max().getAsInt();
            int sum = Arrays.stream(triangles[i]).mapToInt(Integer::parseInt).sum();

            if (max >= (sum - max)) sb.append("Invalid");
            else if (count == 1) sb.append("Equilateral");
            else if (count == 2) sb.append("Isosceles");
            else if (count == 3) sb.append("Scalene");

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
