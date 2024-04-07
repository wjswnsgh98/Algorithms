import java.util.Queue;
import java.util.LinkedList;

class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        answer = visited[maps.length - 1][maps[0].length - 1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        
        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int curX = current[0];
            int curY = current[1];
            
            for(int i = 0; i < 4; i++){
                int nowX = curX + dx[i];
                int nowY = curY + dy[i];
                
                if(nowX < 0 || nowX > maps.length - 1 || nowY < 0 || nowY > maps[0].length - 1){
                    continue;
                }
                
                if(visited[nowX][nowY] == 0 && maps[nowX][nowY] == 1){
                    visited[nowX][nowY] = visited[curX][curY] + 1;
                    queue.add(new int[]{nowX, nowY});
                }
            }
        }
        
    }
}