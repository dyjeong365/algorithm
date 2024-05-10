import java.util.Scanner;

public class Solution {
    static int[] days;

    public static void main(String[] args) {
        final String DELIMITER = "/";
        Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();

        days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < T; i++) {
            String input = sc.next();
            String year = input.substring(0, 4);
            String month = input.substring(4, 6);
            String day = input.substring(6);

            System.out.println(
                    validateDate(month, day)
                            ? "#" + (i + 1) + " " + year + DELIMITER + month + DELIMITER + day
                            : "#" + (i + 1) + " -1"
            );
        }
    }

    private static boolean validateDate(String month, String day) {
        if (Integer.parseInt(month) > 0 && Integer.parseInt(month) < 12) {
            return Integer.parseInt(day) <= days[Integer.parseInt(month)];
        }

        return false;
    }
}
