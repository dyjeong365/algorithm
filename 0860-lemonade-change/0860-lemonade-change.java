class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (var bill : bills) {
            if (bill == 5) {
                fives++;
            }

            else if (bill == 10) {
                tens++;

                if (fives == 0) {
                    return false;
                }

                fives--;
            }

            else {
                // 15$: 10$, 5$ / 5$, 5$, 5$
                if (tens > 0 && fives > 0) {
                    tens--;
                    fives--;
                }

                else if (fives >= 3) {
                    fives -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}