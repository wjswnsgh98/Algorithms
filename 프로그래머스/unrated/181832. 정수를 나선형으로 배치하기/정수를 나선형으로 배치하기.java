class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 숫자
        int row = 0; // 행
        int column = 0; // 열
        int direction = 0; // 상,하,좌,우
        
        while(num <= n*n){
            answer[row][column] = num++;
            if(direction == 0){ // 우로 이동
                if(column == n - 1 || answer[row][column+1] != 0){
                    direction = 1;
                    row++;
                } else {
                    column++;
                }
            } else if(direction == 1){ // 아래로 이동
                if(row == n -1 || answer[row+1][column] != 0){
                    direction = 2;
                    column--;
                } else {
                    row++;
                }
            } else if(direction == 2){ // 좌로 이동
                if(column == 0 || answer[row][column-1] != 0){
                    direction = 3;
                    row--;
                } else {
                    column--;
                }
            } else if(direction == 3){ // 위로 이동
                if(row == 0 || answer[row-1][column] != 0){
                    direction = 0;
                    column++;
                } else {
                    row--;
                }
            }
        }
        return answer;
    }
}