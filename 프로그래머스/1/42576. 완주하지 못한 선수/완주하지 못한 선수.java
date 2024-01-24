// import java.util.Arrays;

// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         Arrays.sort(participant);
//         Arrays.sort(completion);
//         for (int i = 0; i < completion.length; i++) {
//             if (participant[i].equals(completion[i])) {
//                 continue;
//             } else {
//                 return participant[i];
//             }
//         }
//         return participant[participant.length-1];
//     }
// }

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hm = new HashMap<>();
	
        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        // HashMap 순회하기
        // entrySet() : key와 value가 모두 필요한 경우 사용한다.
        // keySet() : key의 값만 필요한 경우 사용한다.
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}