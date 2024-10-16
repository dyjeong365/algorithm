class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> parkingLots = new HashSet<>();

        for (var num : nums) {
            for (int i = num.get(0); i <= num.get(1); i++) {
                parkingLots.add(i);
            }
        }

        return parkingLots.size();
    }
}