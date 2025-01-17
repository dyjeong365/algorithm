class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int remains = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > remains) {
                steps += 2 * i;
                remains = capacity;
            }

            remains -= plants[i];
        }

        steps += plants.length;

        return steps;
    }
}