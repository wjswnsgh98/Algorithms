class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }

        for(int i = n + 1; i < 1000000; i++){
            String binary1 = Integer.toBinaryString(i);
            int count1 = 0;
            for(int j = 0; j < binary1.length(); j++){
                if(binary1.charAt(j) == '1'){
                    count1++;
                }
            }
            if(count == count1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}