import java.util.Stack;
class Solution {
    public Stack<Integer> solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i]*2; j++){
                    answer.push(arr[i]);
                }
            } else{
                for(int j = 0; j < arr[i]; j++){
                    answer.pop();
                }
            }
        }
        return answer;
    }
}