import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(br.readLine());
        System.out.println(factorial(input));

    }

    public static long factorial(long number) {
        if (number <= 1) return 1;

        return number * factorial(number - 1);
    }
}
