import java.lang.Math;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                x--;
                if(Math.abs(x) > board[0] / 2){
                    x++;    
                }
            } else if(keyinput[i].equals("right")){
                x++;
                if(Math.abs(x) > board[0] / 2){
                    x--;    
                }
            } else if(keyinput[i].equals("up")){
                y++;
                if(Math.abs(y) > board[1] / 2){
                    y--;    
                }
            } else if(keyinput[i].equals("down")){
                y--;
                if(Math.abs(y) > board[1] / 2){
                    y++;    
                }
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}