import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] grid = new int[9][9];
        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < grid.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < grid[i].length; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (max <= input) {
                    max = input;
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(max + "\n" + row + " " + column);
    }
}
