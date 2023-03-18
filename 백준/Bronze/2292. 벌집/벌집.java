import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomNumber = Integer.parseInt(br.readLine());

        int index = 2;
        int borderline = 8;
        
        /* 등차수열
        2~7   ( 6개) - 2개의 방
        8~19  (12개) - 3개의 방
        20~37 (18개) - 4개의 방
        38~61 (24개) - 5개의 방
         */

        while (true) {
            if (roomNumber == 1) {
                System.out.println(1);
                break;
            }
            if (roomNumber < borderline) {
                System.out.println(index);
                break;
            }
            borderline += 6 * (index);
            index++;
        }
    }
}