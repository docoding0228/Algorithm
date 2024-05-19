// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;
//         int[] answ = new int[10];
        
//         for(int i=0; i<numbers.length; i++) {
//             answ[numbers[i]] = 1;
//         }
//         for(int i=0; i<answ.length; i++) {
//             if(answ[i] == 0) answer += i;
//         }
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int[] numbers) {
//         int sum = 45;
//         for (int i : numbers) {
//             sum -= i;
//         }
//         return sum;
//     }
// }

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}