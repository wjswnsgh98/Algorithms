class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if('A' <= c && c <= 'Z'){
                answer[c - 'A']++;
            } else if('a' <= c && c <= 'z'){
                answer[26 + c - 'a']++;
            }
        }
        return answer;
    }
}