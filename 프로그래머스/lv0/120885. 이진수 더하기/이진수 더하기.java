class Solution {
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        String answer = Integer.toString(a+b, 2);
        return answer;
    }
}