import java.util.Arrays;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k1 = String.valueOf(k);
        for(int a = i; a <= j; a++){
            String str = String.valueOf(a);
            if(str.contains(k1)){
                String[] str1 = str.split("");
                for(int b = 0; b < str1.length; b++){
                    if(str1[b].equals(k1)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}