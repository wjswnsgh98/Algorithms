class Solution {
    public int solution(String s) {
        int answer = 0;
        String[][] num = {{"0", "zero"}, {"1", "one"}, {"2", "two"}, 
        {"3", "three"}, {"4", "four"}, {"5", "five"}, {"6", "six"}, 
        {"7", "seven"}, {"8", "eight"}, {"9", "nine"}};
        String str = "";
        String st = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(48 <= c && c <= 57){
                str += c;
            } else {
                st += c;
                for(int j = 0; j < num.length; j++){
                    if(st.equals(num[j][1])){
                        st = num[j][0];
                        str += st;
                        st = "";
                    }
                }
            }
        }
        answer = Integer.parseInt(str);
        return answer;
    }
}