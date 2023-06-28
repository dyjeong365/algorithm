class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> isGreatest = new ArrayList<>();
        final int MAX_CANDIES = Arrays.stream(candies).max().getAsInt();
        
        for(var kidWithCandies : candies){
            isGreatest.add(MAX_CANDIES <= kidWithCandies+extraCandies);
        }
        return isGreatest;
    }
}