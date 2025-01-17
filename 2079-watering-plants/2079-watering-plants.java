class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int remains = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= remains) {
                steps++;
            }

            else {
                steps += 2 * i + 1;
                remains = capacity;
            }

            remains -= plants[i];
        }

        return steps;
    }
}