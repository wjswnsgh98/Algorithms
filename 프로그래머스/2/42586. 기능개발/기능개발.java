import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] deploy = new int[progresses.length]; 
        int done = 100;
        
        for(int i = 0; i < progresses.length; i++){
            int x = (done - progresses[i]) % speeds[i];
            if(x == 0){
                deploy[i] = (done - progresses[i]) / speeds[i];
            } else {
                deploy[i] = ((done - progresses[i]) / speeds[i]) + 1;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int pre = deploy[0];
        int count = 1;
        for(int i = 1; i < deploy.length; i++){
            if(pre >= deploy[i]){
                count += 1;
            } else {
                list.add(count);
                count = 1;
                pre = deploy[i];
            }
        }
        list.add(count);
        
        return list;
    }
}