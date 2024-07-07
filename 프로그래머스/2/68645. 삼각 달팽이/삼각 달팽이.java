class Solution {
    public int[] solution(int n) {
        // 최대 개수가 (n * (n + 1)) / 2 임을 알 수 있다.
        int[] answer = new int[(n * (n + 1)) / 2];
        int[][] triangle = new int[n][n];
        
        int x = -1, y = 0; // x좌표가 -1로 하는 이유는 처음 시작을 0으로 넣기 위해서
        int num = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                // 아래
                if(i % 3 == 0){
                    x++;
                }
                // 오른쪽
                else if(i % 3 == 1){
                    y++;
                }
                // 왼쪽 대각선
                else if(i % 3 == 2){
                    x--;
                    y--;
                }
                
                triangle[x][y] = num++;
            }
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(triangle[i][j] == 0){
                    break;
                }
                answer[idx++] = triangle[i][j];
            }
        }
        return answer;
    }
}