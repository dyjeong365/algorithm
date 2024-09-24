class Solution {
    public int countSeniors(String[] details) {
        int seniorCount = 0;

        for (var detail : details) {
            int ageTens = detail.charAt(11) - '0';
            int ageOnes = detail.charAt(12) - '0';
            int age = ageTens * 10 + ageOnes;

            if (age > 60) {
                seniorCount++;
            }
        }

        return seniorCount;
    }
}