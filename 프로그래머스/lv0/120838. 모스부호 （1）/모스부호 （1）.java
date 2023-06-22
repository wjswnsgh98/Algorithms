class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
                          "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                          ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(str[i].equals(morse[j])){ 
                    answer += (char) (j + 97);
                }
            }
        }
        return answer;
    }
}