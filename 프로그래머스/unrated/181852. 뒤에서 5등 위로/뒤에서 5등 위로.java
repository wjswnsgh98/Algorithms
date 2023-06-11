import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int index=0;
        for(int i=0; i<num_list.length; i++){
            if(0 <= i && i < 5){
                continue;
            }
            else{
                answer[index] = num_list[i];
                index++;
            }
        }
        return answer;
    }
}