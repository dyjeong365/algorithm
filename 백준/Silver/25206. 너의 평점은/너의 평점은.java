import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0.0, sum = 0.0, answer = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] student = br.readLine().split(" ");
            double avg = 0.0;
            double grade = Double.parseDouble(student[1]);
            String credit = student[2];

            switch (credit) {
                case "A+":
                    avg = 4.5;
                    break;
                case "A0":
                    avg = 4.0;
                    break;
                case "B+":
                    avg = 3.5;
                    break;
                case "B0":
                    avg = 3.0;
                    break;
                case "C+":
                    avg = 2.5;
                    break;
                case "C0":
                    avg = 2.0;
                    break;
                case "D+":
                    avg = 1.5;
                    break;
                case "D0":
                    avg = 1.0;
                    break;
                default:
                    break;
            }

            if (!credit.equals("P")) {
                sum += grade;
                result += grade * avg;
            }
        }

        answer = sum == 0.0 ? result : result / sum;
        System.out.printf("%6f", answer);
    }
}
