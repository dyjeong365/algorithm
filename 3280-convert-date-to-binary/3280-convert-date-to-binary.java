class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))))
                .append("-")
                .append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))))
                .append("-")
                .append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));

        return sb.toString();
    }
}