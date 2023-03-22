import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int count = 0;
        ArrayList<Integer> wallet = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin > sum) continue;
            wallet.add(coin);
        }

        for (int i = wallet.size() - 1; i >= 0; i--) {
            if (sum == 0) break;
            count += sum / wallet.get(i);
            sum = sum % wallet.get(i);
        }
        System.out.println(count);
    }
}