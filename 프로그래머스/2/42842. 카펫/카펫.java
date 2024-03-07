class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 3; i < sum; i++){
            int num = sum / i;
            if(sum % i == 0 && num >= 3){
                int col = Math.max(i, num);
                int row = Math.min(i, num);
                int ans = (col - 2) * (row - 2);
                
                if(ans == yellow){
                    answer[0] = col;
                    answer[1] = row;
                }
            }
        }
        return answer;
    }
}