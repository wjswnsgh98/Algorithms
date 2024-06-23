class Solution {
    int[] answer;
    private void zip(int[][] arr, int x, int y, int len){
        if(zipChk(arr, x, y, len, arr[x][y])){
            if(arr[x][y] == 1){
                answer[1]++;
            } else {
                answer[0]++;
            }
            return;
        }
        
        // 1사분면
        zip(arr, x, y, len / 2);
        // 2사분면
        zip(arr, x + len / 2, y, len / 2);
        // 3사분면
        zip(arr, x, y + len / 2, len / 2);
        // 4사분면
        zip(arr, x + len / 2, y + len / 2, len / 2);
    }
    
    private boolean zipChk(int[][] arr, int x, int y, int len, int init){
        for(int i = x; i < x + len; i++){
            for(int j = y; j < y + len; j++){
                if(arr[i][j] != init){
                    return false;
                }
            }
        }
        return true;
    }
    
    public int[] solution(int[][] arr) {
        answer = new int[2];
        zip(arr, 0, 0, arr.length);
        return answer;
    }
}