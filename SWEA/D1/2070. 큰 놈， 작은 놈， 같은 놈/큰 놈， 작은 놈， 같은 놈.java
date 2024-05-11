import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int one = sc.nextInt();
            int theOther = sc.nextInt();

            System.out.print("#" + (i + 1) + " ");

            if (one < theOther) {
                System.out.println("<");
            } else if (one == theOther) {
                System.out.println("=");
            } else {
                System.out.println(">");
            }
        }
    }
}
