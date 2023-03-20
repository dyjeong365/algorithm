import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> naturalNumber = new ArrayList<>();
        int[] max = new int[2];

        for (int i = 0; i < 9; i++) {
            naturalNumber.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 9; i++) {
            if (max[0] < naturalNumber.get(i)) {
                max[0] = naturalNumber.get(i);
                max[1] = i + 1;
            }
        }
        System.out.println(max[0] + "\n" + max[1]);
    }
}