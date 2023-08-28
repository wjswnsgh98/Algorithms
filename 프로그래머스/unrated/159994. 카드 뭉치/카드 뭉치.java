class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;

        for (String card : goal) {
            if (index1 < cards1.length && card.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && card.equals(cards2[index2])) {
                index2++;
            } else {
                return "No"; // 만들 수 없는 카드가 goal에 포함되어 있음
            }
        }
        return "Yes";
    }
}