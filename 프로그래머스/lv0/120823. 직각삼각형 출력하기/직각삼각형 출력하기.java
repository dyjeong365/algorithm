import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=number; i++){
            sb.append("*".repeat(i)).append("\n");
        }
        System.out.print(sb);
    }
}