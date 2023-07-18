import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                while(list.size() != query[i] + 1) {
                    list.remove(list.size() - 1);
                }
            } else {
                for(int j = 0; j < query[i]; j++){
                    list.remove(0);    
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}