import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        int extraMinutes = Integer.parseInt(br.readLine());
        int sumMinutes = minutes + extraMinutes;

        hour = hour + sumMinutes / 60;
        hour %= 24;
        minutes = sumMinutes - ((sumMinutes) / 60) * 60;

        System.out.println(hour + " " + minutes);
    }
}