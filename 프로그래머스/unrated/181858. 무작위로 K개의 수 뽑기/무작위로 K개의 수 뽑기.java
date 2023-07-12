import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(list.size() == k){
                break;
            }
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int a = list.size();
        if(list.size() < k){
            for(int i = 0; i < k - a; i++){
                list.add(-1);
            }
        }
        int[] answer = new int[k];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}