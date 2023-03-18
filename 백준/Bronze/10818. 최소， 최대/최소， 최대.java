import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        int number = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < number; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        sb.append(list.stream().mapToInt(el -> el).min().getAsInt())
                .append(" ")
                .append(list.stream().mapToInt(el -> el).max().getAsInt());

        System.out.println(sb);
    }
}