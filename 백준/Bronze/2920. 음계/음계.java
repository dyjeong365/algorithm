import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] order = br.readLine().split(" ");

        for (int i = 1; i < order.length - 1; i++) {
            if (Integer.parseInt(order[0]) + i == Integer.parseInt(order[i])) {
                if (i == order.length - 2) {
                    System.out.println("ascending");
                    break;
                }
                continue;
            } else if (Integer.parseInt(order[0]) - i == Integer.parseInt(order[i])) {
                if (i == order.length - 2) {
                    System.out.println("descending");
                    break;
                }
                continue;
            } else {
                System.out.println("mixed");
                break;
            }
        }
    }
}