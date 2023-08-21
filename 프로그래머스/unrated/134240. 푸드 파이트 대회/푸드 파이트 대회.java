import java.util.ArrayList;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 1){
                food[i] -= 1;
            }
            
            for(int j = 0; j < food[i] / 2; j++){
                list.add(i);
            }
        }
        list.add(0);
        
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) == 0){
                continue;
            }
            list.add(list.get(i));
        }
        
        for(int i = 0; i < list.size(); i++){
            answer += Integer.toString(list.get(i));
        }
        return answer;
    }
}