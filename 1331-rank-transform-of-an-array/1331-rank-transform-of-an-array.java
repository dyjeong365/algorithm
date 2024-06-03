class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ranking = new HashMap<Integer, Integer>();
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedArr);

        for (var el : sortedArr) {
            ranking.putIfAbsent(el, ranking.size() + 1);
        }

        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = ranking.get(arr[i]);
        }

        return sortedArr;
    }
}