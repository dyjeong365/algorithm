import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int COUNT = Integer.parseInt(br.readLine());
        int[][] canvas = new int[100][100];
        int area = 0;

        for (int i = 0; i < COUNT; i++) {
            String[] interval = br.readLine().split(" ");
            int x = Integer.parseInt(interval[0]);
            int y = Integer.parseInt(interval[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    int point = canvas[j][k];
                    
                    if (point == 0) {
                        canvas[j][k] = 1;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}
