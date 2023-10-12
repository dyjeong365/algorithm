import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int X = Integer.parseInt(br.readLine());
        int numerator = 1;
        int denominator = 1;
        boolean up = true;

        for (int i = 1; i < X; i++) {
            if (up) {
                if (numerator > 1) {
                    numerator--;
                    denominator++;
                } else {
                    denominator++;
                    up = false;
                }
            } else {
                if (denominator > 1) {
                    numerator++;
                    denominator--;
                } else {
                    numerator++;
                    up = true;
                }
            }
        }

        System.out.println(numerator + "/" + denominator);
    }
}
