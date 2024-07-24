class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        // 유클리드 호제법으로 최대공약수 구하기
        for(int i = 1; i < arrayA.length; i++){
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }
        
        // 최대값으로 구하기
        if(!divide(arrayA, gcdB)){
            answer = Math.max(answer, gcdB);
        }
        
        if(!divide(arrayB, gcdA)){
            answer = Math.max(answer, gcdA);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a % b == 0){
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public boolean divide(int[] arr, int gcd){
        for(int n : arr){
            if(n % gcd == 0){
                return true;
            }
        }
        return false;
    }
}