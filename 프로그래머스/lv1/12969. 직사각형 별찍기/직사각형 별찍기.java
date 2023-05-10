import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int WIDTH = Integer.parseInt(st.nextToken());
        final int HEIGHT = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<HEIGHT; i++){
            sb.append("*".repeat(WIDTH));
            if(i < HEIGHT-1){
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}