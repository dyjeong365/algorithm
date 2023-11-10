import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int ANGLES = 3;
        int[] triangle = new int[ANGLES];

        for (int i = 0; i < ANGLES; i++) {
            triangle[i] = Integer.parseInt(br.readLine());
        }

        final int SUM = Arrays.stream(triangle).sum();

        if (triangle[0] == triangle[1] && triangle[0] == triangle[2]) {
            System.out.println("Equilateral");
        } 
        
        else if (SUM == 180) {
            if (Arrays.stream(triangle).distinct().count() == 2) {
                System.out.println("Isosceles");
            } 
            
            else {
                System.out.println("Scalene");
            }
        } 
        
        else {
            System.out.println("Error");
        }
    }
}
