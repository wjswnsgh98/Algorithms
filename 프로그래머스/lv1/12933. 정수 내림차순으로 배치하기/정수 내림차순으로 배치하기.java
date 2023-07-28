import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] st = str.split("");
        Arrays.sort(st, Collections.reverseOrder());
        String s = "";
        for(int i = 0; i < st.length; i++){
            s += st[i];
        }
        long answer = Long.parseLong(s);
        return answer;
    }
}