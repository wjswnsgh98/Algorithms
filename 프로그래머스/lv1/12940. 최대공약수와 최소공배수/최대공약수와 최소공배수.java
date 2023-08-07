class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num = Math.max(n, m);
        int num1 = Math.min(n, m);
        answer[0] = GCD(num, num1);
        answer[1] = lcm(num, num1);
        return answer;
    }
    
    public int GCD(int a, int b){
        if(a % b == 0){
            return b;
        }
        return GCD(b, a%b);
    }
    
    public int lcm(int a, int b){
        return a*b / GCD(a,b);
    }
}