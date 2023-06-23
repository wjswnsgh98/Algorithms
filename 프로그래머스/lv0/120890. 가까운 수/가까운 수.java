import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) < min){
                min = Math.abs(array[i] - n);
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) == min){
                answer.add(array[i]);
            }
        }
        Collections.sort(answer);
        return answer.get(0);
    }
}