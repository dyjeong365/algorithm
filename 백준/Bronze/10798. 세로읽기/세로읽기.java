import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] blackboard = new String[5];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < blackboard.length; i++) {
            blackboard[i] = br.readLine();
        }

        final int MAX = Arrays.stream(blackboard).mapToInt(el -> el.length()).max().getAsInt();

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < blackboard.length; j++) {
                if (i < blackboard[j].length()) {
                    sb.append(blackboard[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
