import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> chk = new HashSet<>();
        int x = 0, y = 0;
        
        for(int i = 0; i < dirs.length(); i++){
            // 길 저장
            String str = "";
            // 다음으로 갈 좌표를 현재 좌표로 업데이트
            int nextX = x;
            int nextY = y;
            
            // 위치 바꿔준 이유 (0,0) -> (0,1) 이동과 (0,1) -> (0,0) 이동이 같기 때문에
            if(dirs.charAt(i) == 'U'){
                nextY++;
                str += x;
                str += y;
                str += nextX;
                str += nextY;
            }else if(dirs.charAt(i) == 'D'){
                nextY--;
                str += nextX;
                str += nextY;
                str += x;
                str += y;
            }else if(dirs.charAt(i) == 'R'){
                nextX++;
                str += x;
                str += y;
                str += nextX;
                str += nextY;
            }else if(dirs.charAt(i) == 'L'){
                nextX--;
                str += nextX;
                str += nextY;
                str += x;
                str += y;
            }
            
            if(nextX < -5 || nextY < -5 || nextX > 5 || nextY > 5){
                continue;
            }
            
            chk.add(str);
            // 현재 좌표를 이동한 좌표로 업데이트
            x = nextX;
            y = nextY;
        }
        
        answer = chk.size();
        return answer;
    }
}