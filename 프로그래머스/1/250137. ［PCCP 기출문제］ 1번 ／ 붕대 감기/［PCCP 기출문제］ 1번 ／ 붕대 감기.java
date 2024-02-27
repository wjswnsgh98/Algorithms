class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int attackIdx = 0;
        int success = 0;

        for(int i = 0; i <= attacks[attacks.length-1][0]; i++){
            if(i != attacks[attackIdx][0]){
                answer += bandage[1];
                success++;
                if(success == bandage[0]){
                    answer += bandage[2];
                    success = 0;
                }
                
                if(answer > health){
                    answer = health;
                }
            } else {
                success = 0;
                answer -= attacks[attackIdx][1];
                attackIdx++;
                if(answer <= 0){
                    answer = -1;
                    break;
                }
            }
        }
           
        return answer;
    }
}