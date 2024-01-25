class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < index; j++){
                c += 1; // c를 하나씩 증가시키면서 skip 문자열에 포함된 문자인 경우 다시 반복문을 돌리기 위해서
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
}