class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;
        char[] arr = number.toCharArray();
        int start = 0;
        
        for(int i = 0; i < len; i++){
            char max = '0';
            for(int j = start; j <= i + k; j++){
                if(arr[j] > max){
                    max = arr[j];
                    start = j + 1;
                }
            }
            sb.append(max);
        }
        answer = sb.toString();
        return answer;
    }
}