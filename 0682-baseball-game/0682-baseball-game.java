class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (var operation : operations) {
            if (operation.equals("+")) {
                list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
            }

            else if (operation.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);
            }

            else if (operation.equals("C")) {
                list.remove(list.size() - 1);
            }

            else {
                list.add(Integer.parseInt(operation));
            }
        }

        int sum = 0;

        for (var el : list) {
            sum += el;
        }

        return sum;
    }
}