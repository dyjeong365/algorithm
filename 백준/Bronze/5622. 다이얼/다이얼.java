import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sec = 0;
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            int eachChar = input.charAt(i);

            if (eachChar >= 65 && eachChar < 68) sec += 3;
            else if (eachChar >= 68 && eachChar < 71) sec += 4;
            else if (eachChar >= 71 && eachChar < 74) sec += 5;
            else if (eachChar >= 74 && eachChar < 77) sec += 6;
            else if (eachChar >= 77 && eachChar < 80) sec += 7;
            else if (eachChar >= 80 && eachChar <= 83) sec += 8;
            else if (eachChar > 83 && eachChar <= 86) sec += 9;
            else if (eachChar > 86 && eachChar <= 90) sec += 10;
            else break;
        }
        System.out.println(sec);
    }
}