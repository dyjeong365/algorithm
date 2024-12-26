class Solution {
    public char findKthBit(int n, int k) {
        List<String> list = new ArrayList<>();

        list.add("0");

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            sb.append(list.get(i - 1))
                    .append("1")
                    .append(reverse(invert(list.get(i - 1))));

            list.add(sb.toString());
        }

        return list.get(n - 1).charAt(k - 1);
    }

    private String invert(String input) {
        StringBuilder sb = new StringBuilder();

        for (var pos : input.toCharArray()) {
            sb.append(pos == '1' ? '0' : '1');
        }

        return sb.toString();
    }

    private String reverse(String input) {
        StringBuilder sb = new StringBuilder(input).reverse();

        return sb.toString();
    }
}