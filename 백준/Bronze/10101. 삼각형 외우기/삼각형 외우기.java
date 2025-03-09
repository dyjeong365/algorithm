import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a + b + c;

        if (sum == 180) {
            if (a == 60 && a == b && a == c) {
                sb.append("Equilateral");
            } else if (a == b || a == c || b == c) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
        } else {
            sb.append("Error");
        }

        System.out.print(sb);
    }
}
