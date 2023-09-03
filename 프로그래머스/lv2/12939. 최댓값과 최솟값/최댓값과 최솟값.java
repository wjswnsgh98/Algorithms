class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int[] num1 = new int[num.length];
        for(int i = 0; i < num.length; i++){
            num1[i] = Integer.parseInt(num[i]);
        }
        
        int min = num1[0];
        int max = num1[0];
        for(int i = 1; i < num1.length; i++){
            if(num1[i] > max){
                max = num1[i];
            } else if(num1[i] < min){
                min = num1[i];
            }
        }
        
        String answer = min + " " + max;
        return answer;
    }
}