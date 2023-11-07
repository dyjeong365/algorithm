import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] coordinate = new String[3][2];

        for (int i = 0; i < coordinate.length; i++) {
            coordinate[i] = br.readLine().split(" ");
        }

        int[] countOfDiffX = new int[coordinate.length];
        int[] countOfDiffY = new int[coordinate.length];

        for (int i = 0; i < coordinate.length; i++) {
            for (int j = 0; j < coordinate.length; j++) {
                if (!coordinate[i][0].equals(coordinate[j][0])) countOfDiffX[i]++;
                if (!coordinate[i][1].equals(coordinate[j][1])) countOfDiffY[i]++;
            }
        }

        for (int i = 0; i < countOfDiffX.length; i++) {
            if (countOfDiffX[i] == 2) {
                sb.append(coordinate[i][0]).append(" ");
                break;
            }
        }

        for (int i = 0; i < countOfDiffY.length; i++) {
            if (countOfDiffY[i] == 2) {
                sb.append(coordinate[i][1]).append(" ");
                break;
            }
        }

        System.out.print(sb);
    }
}
