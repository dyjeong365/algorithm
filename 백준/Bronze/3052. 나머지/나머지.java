import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> numbers = new ArrayList<>();

        while (true) {
            String input = br.readLine();
            if (input == null) break;
            numbers.add(Long.parseLong(input));
        }
        Long count = numbers.stream()
                .map(number -> number % 42)
                .distinct()
                .count();
        
        System.out.println(count);
    }
}