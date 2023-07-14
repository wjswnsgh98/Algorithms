class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int c = b / getGCD(min, max);
        while(c != 1){
            if (c % 2 == 0){
                c /= 2;
            } else if(c % 5 == 0){
                c /= 5;
            } else {
                break;
            }
        }
        if(c == 1){
            answer = 1;
        }
        return answer;
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}