class Solution {
    public int solution(int k, int[][] dungeons) {
        return dfs(k, dungeons);
    }
    
    private static int dfs(int k, int[][] dungeons){
        int cnt = 0;
        
        for(int[] dungeon : dungeons){
            int minRequiredFatigue = dungeon[0];
            int fatigueCost = dungeon[1];
            
            if(minRequiredFatigue <= k){
                dungeon[0] = Integer.MAX_VALUE;
                cnt = Math.max(1 + dfs(k - fatigueCost, dungeons), cnt);
                dungeon[0] = minRequiredFatigue;
            }
        }
        
        return cnt;
    }
}