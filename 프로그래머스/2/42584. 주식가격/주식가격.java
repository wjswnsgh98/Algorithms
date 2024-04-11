class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int index = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            int stk = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                if(stk > prices[j]){
                    answer[i] = j - i;
                    break;
                } else {
                    answer[i] = prices.length - (i + 1);
                }
            }
        }
        return answer;
    }
}