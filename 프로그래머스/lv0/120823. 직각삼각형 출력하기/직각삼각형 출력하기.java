import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        
        for(int i=0; i<number; i++){
            if(i>0) sb.append("\n");
            for(int j=0; j<=i; j++){
                sb.append("*");
            }
        }
        System.out.println(sb);
    }
}