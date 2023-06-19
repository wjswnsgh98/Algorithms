import java.util.Arrays;
class Solution {
    public String[] solution(String[] strArr) {
        int size = strArr.length;
        boolean[] str = new boolean[size];
        int length = size;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].contains("ad")){
                str[i] = true;
                length--;
            }
        }
        String[] answer = new String[length];
        int index = 0;
        for(int i = 0; i < size; i++){
            if(!strArr[i].contains("ad")){
                answer[index++] = strArr[i];
            }
        }
        return answer;
    }
}