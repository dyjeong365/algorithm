import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        final int B = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        while (n >= B) {
            if ((n % B) > 9) sb.append((char) (n % B + 55));
            else sb.append(n % B);
            
            n /= B;
        }

        if (n > 9) sb.append((char) (n % B + 55));
        else sb.append(n);

        System.out.println(sb.reverse());
    }
}
