import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        String[] students = br.readLine().split(" ");
        int order = 1;

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(students[i]));
            
            while (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            }
        }

        System.out.print(stack.isEmpty() ? "Nice" : "Sad");
    }
}
