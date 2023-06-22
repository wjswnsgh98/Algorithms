class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String a = Integer.toString(num);
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) - '0' == k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}