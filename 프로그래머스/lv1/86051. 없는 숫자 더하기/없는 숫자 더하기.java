import java.util.ArrayList;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        boolean[] bool = new boolean[num.length];
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(num[i] == numbers[j]){
                    bool[i] = true;
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < bool.length; i++){
            if(!bool[i]){
                answer += num[i];
            }
        }                  
        return answer;
    }
}