import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            } else{
                int last = list.get(list.size() - 1);
                if(list.size() != 0 && last < arr[i]){
                    list.add(arr[i]);
                    i++;
                } else if(list.size() != 0 && last >= arr[i]){
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] stk = new int[list.size()];
        for(i = 0; i < list.size(); i++){
            stk[i] = list.get(i);
        }
        return stk;
    }
}