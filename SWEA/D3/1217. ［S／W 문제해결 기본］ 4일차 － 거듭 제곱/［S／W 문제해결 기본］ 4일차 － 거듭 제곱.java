import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int T = 10;

        for (int i = 0; i < T; i++) {
            final int TN = sc.nextInt();
            final int N = sc.nextInt();
            final int M = sc.nextInt();

            System.out.println("#" + TN + " " + pow(N, M));
        }
    }

    private static int pow(int n, int m) {
        if (m == 1) {
            return n;
        }

        return n * pow(n, m - 1);
    }
}

