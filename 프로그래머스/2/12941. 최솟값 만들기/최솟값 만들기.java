import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] B1 = new Integer[B.length];
        for(int i = 0; i < B.length; i++){
            B1[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(B1, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B1[i];
        }
        return answer;
    }
}