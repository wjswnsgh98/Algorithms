class Solution {
    public int solution(int[][] board) {
        int[][] bomb = new int[board.length + 2][board.length + 2];
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    for(int a = (i-1) + 1; a <= (i+1) + 1; a++){
                        for(int b = (j-1) + 1; b <= (j+1) + 1; b++){
                            bomb[a][b] += 1;
                            if(bomb[a][b] == 1){
                                continue;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 1; i < bomb.length - 1; i++){
            for(int j = 1; j < bomb.length - 1; j++){
                if(bomb[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}