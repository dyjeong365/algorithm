import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] splitedStr = br.readLine().toCharArray();
        
        for(var str : splitedStr){
            sb.append(Character.isUpperCase(str) ? String.valueOf(str).toLowerCase() : String.valueOf(str).toUpperCase()); 
        }
        System.out.print(sb.toString());
    }
}