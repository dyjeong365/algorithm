class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();

        for (var pos : title.split(" ")) {
            if (pos.length() == 1 || pos.length() == 2) {
                sb.append(pos.toLowerCase());
            }

            else {
                sb.append(pos.substring(0, 1).toUpperCase())
                        .append(pos.substring(1).toLowerCase());
            }

            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}