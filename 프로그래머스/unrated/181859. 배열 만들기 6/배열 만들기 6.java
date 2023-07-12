import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(stk.empty()){
                stk.push(arr[i]);
            } else if(!stk.empty()){
                if(stk.peek() == arr[i]){
                    stk.pop();
                } else{
                    stk.push(arr[i]);
                }
            } 
        }
        if(stk.size() == 0){
            stk.push(-1);
        }
        int[] answer = new int[stk.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = stk.get(i);
        }
        return answer;
    }
}