import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String str = "";
        int size = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(48 <= my_string.charAt(i) && my_string.charAt(i) <=57){
                str += (char) (my_string.charAt(i));
                size++;
            }
        }
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = str.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}