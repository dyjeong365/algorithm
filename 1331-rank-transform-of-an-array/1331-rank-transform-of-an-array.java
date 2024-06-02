class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
        Map<Integer, Integer> ranking = new HashMap<Integer, Integer>();

        for (var el : arr) {
            map.put(el, true);
        }

        int rank = 1;

        for (var keySet : map.keySet()) {
            ranking.put(keySet, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranking.get(arr[i]);
        }

        return arr;
    }
}