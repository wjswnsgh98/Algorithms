import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length == 1){
            list.add(-1);
        } else {
            for(int i = 0; i < arr.length; i++){
                list.add(arr[i]);
            }
        }
        
        if(list.size() > 1){
            int min = 100000000;
            int index = -1;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < min){
                    min = list.get(i);
                    index = i;
                }
            }
            list.remove(index);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}