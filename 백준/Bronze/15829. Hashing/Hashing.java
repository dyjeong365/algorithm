import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int R = 31;
    static final long M = 1_234_567_891;
    static String vanila;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(br.readLine());
        vanila = br.readLine();

        makeHash();
    }

    private static void makeHash() {
        long sum = 0;

        for (int i = 0; i < length; i++) {
            sum += ((vanila.charAt(i) - '`') * pow(i)) % M;
        }

        System.out.print(sum % M);
    }

    private static long pow(int index) {
        long result = 1;

        for (int j = 0; j < index; j++) {
            result = (result * R) % M;
        }

        return result;
    }
}
