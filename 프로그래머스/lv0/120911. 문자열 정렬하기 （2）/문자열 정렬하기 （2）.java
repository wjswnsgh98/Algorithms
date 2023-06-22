import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] ch = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            ch[i] += my_string.charAt(i);
        }
        Arrays.sort(ch);
        String answer = "";
        for(int i = 0; i < ch.length; i++){
            answer += ch[i];    
        }
        return answer;
    }
}