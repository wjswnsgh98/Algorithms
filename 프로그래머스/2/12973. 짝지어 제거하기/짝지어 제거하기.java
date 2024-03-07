import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<String> stk = new Stack<>();
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++){
            if(stk.isEmpty()){
                stk.push(str[i]);
            } else {
                if(stk.peek().equals(str[i])){
                    stk.pop();
                } else {
                    stk.push(str[i]);
                }
            }
        }
        
        if(stk.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}