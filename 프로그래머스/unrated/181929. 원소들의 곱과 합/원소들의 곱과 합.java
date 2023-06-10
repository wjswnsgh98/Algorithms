class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = num_list[0];
        int result1 = 0;
        for(int i=1; i<num_list.length; i++){
            result *= num_list[i];
        }
        for(int i=0; i<num_list.length; i++){
            result1 += num_list[i]; 
        }
        result1 = result1*result1;
        if(result<result1){
            answer=1;
        }
        else if(result>result1){
            answer=0;
        }
        return answer;
    }
}