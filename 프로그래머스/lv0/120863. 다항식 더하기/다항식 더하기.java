import java.util.ArrayList;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] poly = polynomial.split(" +");
        int xSum = 0;
        int sum = 0;
        for(int i = 0; i < poly.length; i++){
            if(poly[i].contains("x")){
                if(poly[i].equals("x")){
                    xSum++;
                } else {
                    String x = poly[i].substring(0, poly[i].length()-1);
                    xSum += Integer.parseInt(x);
                }
            } else if(!poly[i].equals("+")){
                sum += Integer.parseInt(poly[i]);
            }
        }
        if(xSum != 0 && sum == 0){
            if(xSum == 1){
                answer = "x";
            } else {
                answer = xSum + "x";
            }
        } else if(xSum == 0 && sum != 0){
            answer = String.valueOf(sum);
        } else {
            if(xSum == 1){
                answer = "x" + " " + "+" + " " + sum;
            } else {
                answer = xSum + "x" + " " + "+" + " " + sum;
            }
        }
        return answer;
    }
}