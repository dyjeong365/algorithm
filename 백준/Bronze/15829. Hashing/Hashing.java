import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String vanila;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(br.readLine());
        vanila = br.readLine();

        makeHash();
    }

    private static void makeHash() {
        long result = 0;
        final int R = 31;
        final int M = 1234567891;

        char[] splitedVanila = vanila.toCharArray();

        for (int i = 0; i < length; i++) {
            result += ((Math.pow(R, i) * (splitedVanila[i] - '`')) % M);
        }

        System.out.print(result);
    }
}
