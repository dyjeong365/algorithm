class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> isGreatest = new ArrayList<>();
        
        for(int i=0; i<candies.length; i++){
            int max = Arrays.stream(candies).max().getAsInt();
            
            isGreatest.add(max <= candies[i]+extraCandies);
        }
        return isGreatest;
    }
}