class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0, right = sequence.length;
        int sum = 0;
        
        for(int l = 0, r = 0; l < sequence.length; l++){
            while(r < sequence.length && sum < k){
                sum += sequence[r++];
            }
            
            if(sum == k){
                int range = r - l - 1;
                if((right - left) > range){
                    left = l;
                    right = r - 1;
                }
            }
            sum -= sequence[l];
        }
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}