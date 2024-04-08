// 시간 초과 코드
// class Solution {
//     public int[] solution(int[] numbers) {
//         int[] answer = new int[numbers.length];
        
//         for(int i = 0; i < numbers.length; i++){
//             if(i == numbers.length - 1){
//                 answer[i] = -1;
//                 break;
//             }
            
//             for(int j = i + 1; j < numbers.length; j++){
//                 if(numbers[i] < numbers[j]){
//                     answer[i] = numbers[j];
//                     break;
//                 } else if(numbers[i] == numbers[j] || numbers[i] > numbers[j]){
//                     if(numbers[i] < numbers[j]){
//                         answer[i] = numbers[j];
//                         break;
//                     } else {
//                         answer[i] = -1;
//                     }
//                 } else {
//                     answer[i] = -1;
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
// }
import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stk = new Stack<>();
        
        for(int i = numbers.length - 1; i >= 0; i--){
            while(!stk.isEmpty()){
                if(stk.peek() > numbers[i]){
                    answer[i] = stk.peek();
                    break;
                } else {
                    stk.pop();
                }
            }
            if(stk.isEmpty()){
                answer[i] = -1;
            }
            stk.push(numbers[i]);
        }
        return answer;
    }
}