import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int max = 0;

            for (int j = 0; j < 10; j++) {
                max = Math.max(max, sc.nextInt());
            }

            System.out.println("#" + (i + 1) + " " + max);
        }
    }
}
