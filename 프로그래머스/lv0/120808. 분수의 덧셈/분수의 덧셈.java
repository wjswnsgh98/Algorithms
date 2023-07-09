class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2]; 
        
        int num = num1*num2; //분모
        int denum = denum1*num2+denum2*num1; //분자
        int max = 1;  
        
        for(int i=1; i <= num && i<= denum; i++){ //최대 공약수
            if(num % i == 0 && denum % i == 0){
                max = i;
            }
        }
        answer[0] = denum / max; //분자
        answer[1] = num / max; //분모
        return answer;
    }
}