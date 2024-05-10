import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static List<String> months;
    static int[] days;

    public static void main(String[] args) {
        final String DELIMITER = "/";
        Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();
        months = Arrays.asList
                (
                        "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"
                );
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
        if (months.contains(month)) {
            return Integer.parseInt(day) <= days[Integer.parseInt(month)];
        }

        return false;
    }
}
