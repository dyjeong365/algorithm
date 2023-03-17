import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int numberOfCommand = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfCommand; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) stack.pop();
            else stack.push(input);
        }

        int sum = 0;
        int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}