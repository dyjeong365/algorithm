import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        sb.append("a = ")
            .append(st.nextToken())
            .append("\n")
            .append("b = ")
            .append(st.nextToken());
        System.out.print(sb);
    }
}