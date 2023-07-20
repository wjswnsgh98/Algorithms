class Solution {
    public int solution(int[][] board) {
        boolean[][] bomb = new boolean[board.length][board.length];
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    bomb[i][j] = true;
                    for(int n = 0; n < 8; n++){
                        int x = i + dx[n];
                        int y = j + dy[n];
                        if(x >= 0 && x < board.length && y >= 0 && y < board.length){
                            bomb[x][y] = true;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(!bomb[i][j]){
                    answer++;
                }
            }
        }
        return answer;
    }
}