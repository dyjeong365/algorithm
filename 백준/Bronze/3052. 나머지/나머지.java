import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> numbers = new HashSet<>();

        while (true) {
            String input = br.readLine();
            if (input == null) break;

            numbers.add(Integer.parseInt(input) % 42);
        }
        System.out.println(numbers.size());
    }
}