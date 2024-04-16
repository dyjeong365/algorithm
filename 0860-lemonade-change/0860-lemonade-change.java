class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (var bill : bills) {
            if (bill == 5) {
                fives++;
            }

            else if (bill == 10) {
                if (fives == 0) {
                    return false;
                }

                tens++;
                fives--;
            }

            // pay: 20$, change: 15$
            else {
                // 10$, 5$
                if (tens > 0 && fives > 0) {
                    tens--;
                    fives--;
                }

                // 5$, 5$, 5$
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