class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int dart[] = new int[3]; // 세번의 기회에서 다트 점수 구하기 위한 배열
        int num = 0;
        int index = 0;
        String str = "";
        
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            // 문자가 숫자일 경우
            if('0' <= c && c <= '9'){
                str += String.valueOf(c);
            } else if(c == 'S' || c == 'D' || c == 'T'){ // 보너스인 경우
                num = Integer.parseInt(str);
                if(c == 'S'){
                    // int로 바꿔주는 이유는 Math.pow의 입출력이 double형이기 때문
                    dart[index++] = (int) Math.pow(num, 1);
                } else if(c == 'D'){
                    dart[index++] = (int) Math.pow(num , 2);
                } else {
                    dart[index++] = (int) Math.pow(num, 3);
                }
                str = ""; // 계산 다 된 후 문자열 초기화
            } else { // 옵션일 때
                if(c == '*'){
                    dart[index - 1] *= 2;
                    if(index - 2 >= 0){
                        dart[index - 2] *= 2;
                    }
                } else {
                    dart[index - 1] *= (-1);
                }
            }
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}