import java.lang.Math;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max = -256;
        int max1 = -256;
        int min = 256;
        int min1 = 256;
        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] > max){
                max = dots[i][0];
            } else if(dots[i][0] < min){
                min = dots[i][0];
            }
            
            if(dots[i][1] > max1){
                max1 = dots[i][1];
            } else if(dots[i][1] < min1){
                min1 = dots[i][1];
            }
        }
        answer = Math.abs((max-min) * (max1-min1));
        return answer;
    }
}