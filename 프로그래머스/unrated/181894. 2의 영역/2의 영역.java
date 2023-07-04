import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        if(start != -1){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 2){
                    end = i;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(start == -1){
            list.add(-1);
        } else if(start == end){
            list.add(2);
        } else{
            for(int i = start; i <= end; i++){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}