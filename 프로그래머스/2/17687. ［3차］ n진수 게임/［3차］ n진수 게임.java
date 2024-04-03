class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        int num = 0;
        while(str.length() < t * m){
            str += Integer.toString(num++, n).toUpperCase();
        }
        
        for(int i = p - 1; i < t * m; i += m){
            answer += str.charAt(i);
        }
        return answer;
    }
}