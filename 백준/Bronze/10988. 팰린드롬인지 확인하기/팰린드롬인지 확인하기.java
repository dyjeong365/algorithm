import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int length = input.length();

        if (length == 1) System.out.println(1);

        for (int i = 0; i < length / 2; i++) {
            boolean isNotPalindrome = input.charAt(i) != input.charAt(length - (i + 1));
            if (isNotPalindrome) {
                System.out.println(0);
                break;
            } else if (i == length / 2 - 1) {
                System.out.println(1);
            }
        }
    }
}
