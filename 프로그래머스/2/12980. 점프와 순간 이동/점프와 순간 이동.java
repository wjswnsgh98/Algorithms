import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 최대한 건전지 사용량을 줄이려면 점프를 많이 이용해야한다.
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}