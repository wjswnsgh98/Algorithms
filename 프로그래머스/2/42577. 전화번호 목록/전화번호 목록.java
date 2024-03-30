import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // 길이로 정렬할 필요 없이
        // Arrays.sort(phone_book, (String s1, String s2) -> s1.length() - s2.length());
        // 사전순으로 정렬하면 바로 앞에가 뒤에 문자열에서 시작하는지 확인해보면 되기 때문에 효율성이 더 좋아짐
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i + 1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }
}