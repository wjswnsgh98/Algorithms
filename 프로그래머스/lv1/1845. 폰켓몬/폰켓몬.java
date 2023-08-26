import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        int answer = 0;
        
        // 중복 원소 제거
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            num.add(nums[i]);
        }
        
        if(max < num.size()){
            answer = max;
        } else {
            answer = num.size();
        }
        
        return answer;
    }
}