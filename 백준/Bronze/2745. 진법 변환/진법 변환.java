import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final String N = input[0];
        final int B = Integer.parseInt(input[1]);

        System.out.println(Integer.parseInt(N, B));
    }
}
