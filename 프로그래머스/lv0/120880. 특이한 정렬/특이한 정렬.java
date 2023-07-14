import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] result = new double[numlist.length];
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] - n < 0){
                result[i] = Math.abs(numlist[i]-n) + 0.5;
            } else{
                result[i] = numlist[i] - n;
            }
        }
        Arrays.sort(result);
        for(int i = 0; i < numlist.length; i++) {
            if(result[i] % 1 != 0){ // 소수점이하를 가지는지 확인하는 조건문
                answer[i] = n - (int)result[i];    
            } else {
                answer[i] = (int)result[i] + n;    
            }
        }
        return answer;
    }
}