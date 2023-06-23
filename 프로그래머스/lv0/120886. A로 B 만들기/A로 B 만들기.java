import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] ch = before.toCharArray();
        char[] ch1 = after.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int count = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch1[i]){
                count++;
                if(count == ch.length){
                    answer = 1;    
                }
            }
        }
        return answer;
    }
}