class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if(inclination(dots[0], dots[1]) == inclination(dots[2], dots[3])){
            answer = 1;
        }
        if(inclination(dots[0], dots[2]) == inclination(dots[1], dots[3])){
            answer = 1;
        }
        if(inclination(dots[0], dots[3]) == inclination(dots[1], dots[2])){
            answer = 1;
        }
        return answer;
    }
    
    public double inclination(int[] num1, int[] num2){
        return (double) (num2[1] - num1[1]) / (num2[0] - num1[0]);
    } 
}