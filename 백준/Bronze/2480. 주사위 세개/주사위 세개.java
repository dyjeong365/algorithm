import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int another = Integer.parseInt(st.nextToken());
        int theOther = Integer.parseInt(st.nextToken());

        if (one == another && another == theOther) {
            System.out.println(10000 + (one) * 1000);
        } else if (one == another || one == theOther) {
            System.out.println(1000 + one * 100);
        } else if (another == theOther) {
            System.out.println(1000 + another * 100);
        } else {
            int max = 0;
            max = Math.max(one, another);
            max = Math.max(max, theOther);
            System.out.println(max * 100);
        }
    }
}