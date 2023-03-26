import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int EARLY = 45;
        final int CRITERIA = 60;

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        if (minutes >= EARLY) minutes -= EARLY;
        else {
            if (hour == 0) hour = 23;
            else hour -= 1;
            minutes = (minutes + CRITERIA) - EARLY;
        }

        System.out.println(hour + " " + minutes);
    }
}