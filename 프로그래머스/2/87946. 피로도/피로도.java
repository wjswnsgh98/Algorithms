import java.util.*;
class Solution {
    static int answer = 0;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {      
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    public void dfs(int cnt, int fatigue, int[][] dungeon) {
        for(int i = 0; i < dungeon.length; i++){
            if(visited[i] || dungeon[i][0] > fatigue) continue;
            visited[i] = true;
            dfs(cnt + 1, fatigue - dungeon[i][1], dungeon);
            visited[i] = false;
        }
        answer = Math.max(cnt, answer);
    }
}