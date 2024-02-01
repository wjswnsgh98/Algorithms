class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                numbers[i] = 11;
            }
            if(numbers[i] % 3 == 0){
                answer += "R";
                right = numbers[i];
            } else if(numbers[i] % 3 == 1){
                answer += "L";
                left = numbers[i];
            } else {
                int difL = numbers[i] - left > 0 ? numbers[i] - left : left - numbers[i];
                int difR = numbers[i] - right > 0 ? numbers[i] - right : right - numbers[i];
                int disL = (difL % 3) + (difL / 3);
                int disR = (difR % 3) + (difR / 3);
                
                if(disL < disR){
                    answer += "L";
                    left = numbers[i];
                } else if(disL > disR){
                    answer += "R";
                    right = numbers[i];
                } else {
                    answer += hand.equals("right") ? "R" : "L";
                    if(hand.equals("right")){
                        right = numbers[i];
                    } else {
                        left = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}