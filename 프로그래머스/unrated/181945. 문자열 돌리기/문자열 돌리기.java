import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] splitedStr = br.readLine().split("");
        
        for(var letter : splitedStr){
            sb.append(letter)
                .append("\n");
        }
        System.out.print(sb);
    }
}