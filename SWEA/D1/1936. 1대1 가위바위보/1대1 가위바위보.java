import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        char[][] ans = new char[4][4];

        final int A = Integer.parseInt(input[0]);
        final int B = Integer.parseInt(input[1]);

        /*
         가위:1, 바위:2, 보:3
         비기는 경우는 없음
         A:1 B:3
         A:2 B:1
         A:3 B:2
         */
        ans[1][3] = 'A';
        ans[2][1] = 'A';
        ans[3][2] = 'A';
        ans[3][1] = 'B';
        ans[1][2] = 'B';
        ans[2][3] = 'B';

        System.out.print(ans[A][B]);
    }
}
