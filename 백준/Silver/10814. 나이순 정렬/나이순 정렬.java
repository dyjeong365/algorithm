import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder[] people = new StringBuilder[201];

        for (int i = 0; i < people.length; i++) {
            people[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];

            people[age].append(age)
                    .append(" ")
                    .append(name)
                    .append("\n");
        }

        for (var el : people) {
            sb.append(el);
        }

        System.out.print(sb);
    }
}
