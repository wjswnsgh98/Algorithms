class Solution {
    public String solution(int age) {
        String answer = "";
        int a = 0;
        String str = Integer.toString(age);
        for(int i = 0; i < str.length(); i++){
            a = str.charAt(i) - '0';
            answer += (char) (a + 97);
        }
        return answer;
    }
}