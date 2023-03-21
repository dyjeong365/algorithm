import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int eachNum = Character.getNumericValue(input.charAt(i));
            if (eachNum == 0) continue;
            sum += eachNum;
        }
        System.out.println(sum);
    }
}