import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] students = new int[30];
        for (int i = 1; i <= students.length; i++) {
            students[i - 1] = i;
        }

        for (int i = 1; i <= 28; i++) {
            students[Integer.parseInt(br.readLine()) - 1] = 0;
        }

        for (int i = 1; i <= students.length; i++) {
            if (students[i - 1] != 0) sb.append(students[i - 1] + "\n");
        }
        System.out.print(sb);
    }
}