import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        final int CHESSBOARD_SIDE_LENGTH = 8;
        final int CHESSBOARD_SIZE = (int) Math.pow(CHESSBOARD_SIDE_LENGTH, 2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int M = Integer.parseInt(input[1]);
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - CHESSBOARD_SIDE_LENGTH; i++) {
            for (int j = 0; j <= M - CHESSBOARD_SIDE_LENGTH; j++) {
                int count = 0;
                boolean color = (board[i][j] == 'W');

                count = getCount(i, CHESSBOARD_SIDE_LENGTH, j, color, board, count);
                min = Math.min(min, Math.min(count, CHESSBOARD_SIZE - count));
            }
        }

        System.out.println(min);
    }

    private static int getCount(int i, final int CHESSBOARD_SIDE_LENGTH, int j, boolean color, char[][] board, int count) {
        for (int k = i; k < i + CHESSBOARD_SIDE_LENGTH; k++) {
            for (int l = j; l < j + CHESSBOARD_SIDE_LENGTH; l++) {
                if (color != (board[k][l] == 'W')) {
                    count++;
                }

                color = !color;
            }

            color = !color;
        }
        return count;
    }
}
