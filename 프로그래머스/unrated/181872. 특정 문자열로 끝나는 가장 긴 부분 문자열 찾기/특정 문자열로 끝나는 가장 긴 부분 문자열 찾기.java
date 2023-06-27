import java.util.Arrays;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int i = myString.lastIndexOf(pat);
        if (i != -1) {
          answer = myString.substring(0, i + pat.length());
        }
        return answer;
        // String answer = "";
        // char[] ch = myString.toCharArray();
        // char[] ch1 = pat.toCharArray();
        // int count = 0;
        // for(int i = 0; i < ch.length; i++){
        //     answer += ch[i];
        //     count++;
        //     if(count == ch.length){
        //         break;
        //     }
        //     if(ch[i] == ch1[ch1.length - 1]){
        //         if(ch[i] == ch[i + 1]){
        //             continue;
        //         } else {
        //            break; 
        //         }  
        //     }
        // }
        // return answer;
    }
}