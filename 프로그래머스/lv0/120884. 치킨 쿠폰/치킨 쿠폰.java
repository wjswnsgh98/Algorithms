class Solution {
    final int coupon = 10;
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= coupon){
            int remain = chicken % coupon;
            int service = chicken / coupon;
            chicken = remain + service;
            answer += service;
        }
        return answer;
    }
}