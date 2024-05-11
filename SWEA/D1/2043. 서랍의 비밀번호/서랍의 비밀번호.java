import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        final int P = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);

        System.out.print(P - K + 1);
    }
}
