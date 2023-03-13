import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int ASCII_a = 97;

        String word = br.readLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int alphabet = word.charAt(i);
            if (alphabet < ASCII_a) {
                result = result + Character.toLowerCase(word.charAt(i));
            } else {
                result = result + Character.toUpperCase(word.charAt(i));
            }
        }
        System.out.println(result);
    }
}