import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow((int) Math.pow(2, N) + 1, 2));
    }
}
