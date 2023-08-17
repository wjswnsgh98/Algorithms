class Solution {
    public String[] addition(int n, String str){
        if(str.length() != n){
            String zero = "";
            for(int j = 0; j < n - str.length(); j++){
                zero += "0";
            }
            str = zero + str;
        }
        return str.split("");
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            String[] bin1 = addition(n, binary1);
            String[] bin2 = addition(n, binary2);
            
            String str = "";
            for(int j = 0; j < n; j++){
                if(bin1[j].equals("1") || bin2[j].equals("1")){
                    str += "#";
                } else {
                    str += " ";    
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}