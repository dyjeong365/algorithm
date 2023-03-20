import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int courses = Integer.parseInt(br.readLine());
        double[] scores = new double[courses];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < courses; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        double max = Arrays.stream(scores)
                .max()
                .getAsDouble();

        for (int i = 0; i < courses; i++) {
            scores[i] = scores[i] / max * 100;
        }

        double average = Arrays.stream(scores)
                .average()
                .getAsDouble();

        System.out.println(average);
    }
}