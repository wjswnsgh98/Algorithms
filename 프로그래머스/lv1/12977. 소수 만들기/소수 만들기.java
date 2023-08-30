class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    chk = number(sum);
                    if(chk){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean number(int sum){
        boolean check = true;
        if(sum == 2){
            return check;
        }
        for(int i = 2; i < sum; i++){
            if(sum % i == 0){
                check = false;
                break;
            }
            
        }
        return check;
    }
}