class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i < num_list.length; i++){
            if((i+1) % 2 == 1){
                sum += num_list[i];
            }
            else{
                sum1 += num_list[i];
            }
        }
        if(sum > sum1){
            answer = sum;
        }
        else{
            answer = sum1;
        }
        return answer;
    }
}