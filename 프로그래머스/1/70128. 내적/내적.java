// class Solution {
//     public int solution(int[] a, int[] b) {
//         int answer = 0;
        
//         for(int i=0; i<a.length; i++) {
//             answer += a[i] * b[i];
//         }
//         return answer;
//     }
// }

// class Solution {
//     public int solution(int[] a, int[] b) {
//          int sum = 0;
//         for(int i=0; i<a.length; i++){
//             sum+= a[i] * b[i];
//         }
//         return sum;
//     }
// }

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}