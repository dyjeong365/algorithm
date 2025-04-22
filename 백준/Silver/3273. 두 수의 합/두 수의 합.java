import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] sequence = new int[n];
        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sequence);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            if (sequence[left] + sequence[right] < x) {
                left++;
            } else if (sequence[left] + sequence[right] > x) {
                right--;
            } else {
                count++;
                left++;
                right--;
            }
        }
        
        System.out.print(count);
    }
}
