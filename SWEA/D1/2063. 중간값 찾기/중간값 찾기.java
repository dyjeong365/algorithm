import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);

        System.out.println(scores[N / 2]);
    }
}
