import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int reversedFirst = (first % 10) * 100 + first % 100 / 10 * 10 + first / 100;
        int reversedSecond = (second % 10) * 100 + second % 100 / 10 * 10 + second / 100;

        System.out.println(reversedFirst > reversedSecond ? reversedFirst : reversedSecond);
    }
}