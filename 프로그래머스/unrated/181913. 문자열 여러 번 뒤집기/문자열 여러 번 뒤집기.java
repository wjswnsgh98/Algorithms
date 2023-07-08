class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j <= (s+e) / 2; j++){
                char temp = ch[j];
                ch[j] = ch[s+e-j];
                ch[s+e-j] = temp;
            }
        }
        for(int i = 0; i < ch.length; i++){
            answer += ch[i];
        }
        return answer;
    }
}