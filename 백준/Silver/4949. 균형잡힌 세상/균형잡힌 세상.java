import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            sb.append(isItBalanced(input))
                    .append("\n");
        }

        System.out.print(sb);
    }

    private static String isItBalanced(String input) {
        Stack<Character> characterStack = new Stack<>();

        for (char el : input.toCharArray()) {
            if (el == '(' || el == '[') {
                characterStack.push(el);
            } else if (el == ')') {
                if (characterStack.isEmpty() || characterStack.peek() != '(') {
                    return "no";
                } else {
                    characterStack.pop();
                }
            } else if (el == ']') {
                if (characterStack.isEmpty() || characterStack.peek() != '[') {
                    return "no";
                } else {
                    characterStack.pop();
                }
            }
        }

        return characterStack.isEmpty() ? "yes" : "no";
    }
}
