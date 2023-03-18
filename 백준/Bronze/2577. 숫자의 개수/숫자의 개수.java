import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] countRepo = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = "";
        result = result + (A * B * C);

        for (int i = 0; i < result.length(); i++) {
            switch (result.charAt(i)) {
                case '0':
                    countRepo[0] += 1;
                    break;
                case '1':
                    countRepo[1] += 1;
                    break;
                case '2':
                    countRepo[2] += 1;
                    break;
                case '3':
                    countRepo[3] += 1;
                    break;
                case '4':
                    countRepo[4] += 1;
                    break;
                case '5':
                    countRepo[5] += 1;
                    break;
                case '6':
                    countRepo[6] += 1;
                    break;
                case '7':
                    countRepo[7] += 1;
                    break;
                case '8':
                    countRepo[8] += 1;
                    break;
                case '9':
                    countRepo[9] += 1;
                    break;
            }
        }
        for (int i = 0; i < countRepo.length; i++) {
            sb.append(countRepo[i] + "\n");
        }
        System.out.print(sb);
    }
}