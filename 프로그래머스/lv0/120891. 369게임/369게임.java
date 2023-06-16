class Solution {
    public int solution(int order) {
        int answer = 0;
        String result = Integer.toString(order);
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) == '3' || result.charAt(i) == '6' || result.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}