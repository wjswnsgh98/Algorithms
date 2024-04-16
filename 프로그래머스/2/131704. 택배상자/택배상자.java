import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        int index = 0;
        
        for(int i = 1; i <= order.length; i++){
            if(i == order[index]){
                answer++;
                index++;
            } else {
               stk.push(i);
            }
            while(!stk.isEmpty() && stk.peek() == order[index]){
                stk.pop();
                answer++;
                index++;
            }
        }
        return answer;
    }
}