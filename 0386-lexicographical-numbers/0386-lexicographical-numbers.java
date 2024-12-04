class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(String.valueOf(i));
        }

        Collections.sort(list);

        for (var pos : list) {
            res.add(Integer.parseInt(pos));
        }

        return res;
    }
}