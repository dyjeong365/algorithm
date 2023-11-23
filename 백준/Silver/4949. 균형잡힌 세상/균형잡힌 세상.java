import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();

        while (true) {
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            input = input.replaceAll("[a-zA-Z|\\s]", "");

            for (char el : input.toCharArray()) {
                if (el == '(' || el == '[') {
                    characterStack.push(el);
                } else if (el == ')') {
                    if (characterStack.isEmpty() || characterStack.peek() != '(') {
                        sb.append("no").append("\n");
                        break;
                    } else {
                        characterStack.pop();
                    }
                } else if (el == ']') {
                    if (characterStack.isEmpty() || characterStack.peek() != '[') {
                        sb.append("no").append("\n");
                        break;
                    } else {
                        characterStack.pop();
                    }
                } else if (el == '.') {
                    sb.append(characterStack.isEmpty() ? "yes" : "no")
                            .append("\n");
                }
            }

            characterStack.clear();
        }

        System.out.print(sb);
    }
}
