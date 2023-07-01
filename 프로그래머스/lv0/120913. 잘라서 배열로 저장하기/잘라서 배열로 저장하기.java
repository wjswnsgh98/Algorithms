class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if(my_str.length() % n == 0){
            len = my_str.length() / n;
        } else {
            len = my_str.length() / n + 1;
        }
        String[] answer = new String[len];
        int count = 0;
        for(int i = 0; i < answer.length; i++){
            String str = "";
            for(int j = count; j < my_str.length(); j++){
                str += my_str.charAt(j);
                count++;
                if(count % n == 0){
                  break;  
                } 
            }
            answer[i] = str;
        }
        return answer;
    }
}