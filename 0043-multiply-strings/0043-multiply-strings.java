class Solution {
    public String multiply(String num1, String num2) {
        int[] pos = new int[num1.length() + num2.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int front = i + j;
                int rear = i + j + 1;
                int sum = mul + pos[rear];

                pos[front] += sum / 10;
                pos[rear] = (sum) % 10;
            }
        }

        for (var p : pos) {
            if (!(sb.isEmpty() && p == 0))
                sb.append(p);
        }

        return sb.isEmpty() ? "0" : sb.toString();
    }
}