import java.util.ArrayList;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);
            if(str[1].equals("+")){
                if(num1 + num2 == result){
                    answer[index++] = "O";
                } else {
                    answer[index++] = "X";
                }
            } else{
                if(num1 - num2 == result){
                    answer[index++] = "O";
                } else {
                    answer[index++] = "X";
                }
            }
        }    
        return answer;
    }
}