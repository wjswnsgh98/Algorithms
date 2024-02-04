class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] mbti = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}; // 성격 유형
        int[] score = new int[8]; // 성격 유형 점수
        
        for(int i = 0; i < survey.length; i++){
            char c = '\0';
            int s = choices[i];
            if(s < 4){ // 비동의 관련
                c = survey[i].charAt(0);
                if(s == 3){ 
                    s = 1;
                } else if(s == 1){
                    s = 3; 
                }
            } else if(s > 4){ // 동의 관련
                c = survey[i].charAt(1);
                s -= 4;
            } else { // 모르겠음 선택 시 점수를 얻지 않음
                continue;
            }
            
            for(int j = 0; j < mbti.length; j++){
                if(c == mbti[j]){
                    score[j] += s;
                }
            }
        }
        
        for(int i = 0; i < mbti.length; i = i + 2){
            if(score[i] < score[i + 1]){
                answer += mbti[i + 1];
            } else if(score[i] > score[i + 1]){
                answer += mbti[i];
            } else { // 성격 유형 점수가 같으면 사전 순으로 빠른 성격 유형
                if (mbti[i] > mbti[i + 1]){
                    answer += mbti[i + 1];
                } else {
                    answer += mbti[i];
                }
            }
        }
        return answer;
    }
}