class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();

        sb.append(
                Integer.toString(
                        Integer.parseInt(date.substring(0, 4)), 2))
                .append("-")
                .append(
                        Integer.toString(
                                Integer.parseInt(date.substring(5, 7)), 2))
                .append("-")
                .append(
                        Integer.toString(
                                Integer.parseInt(date.substring(8)), 2));

        return sb.toString();
    }
}