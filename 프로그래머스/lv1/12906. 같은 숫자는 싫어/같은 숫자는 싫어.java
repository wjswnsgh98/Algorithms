import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(stk.empty() || stk.peek() != arr[i]){
                stk.push(arr[i]);
            } else {
                continue;
            } 
        }
        int[] answer = new int[stk.size()];
        for(int i = 0; i < stk.size(); i++){
            answer[i] = stk.get(i);
        }
        return answer;
    }
}