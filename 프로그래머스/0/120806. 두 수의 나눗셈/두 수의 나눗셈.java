// class Solution {
//     public int solution(int num1, int num2) {
//         if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
//             double answer = (double) num1 / num2 * 1000;
//             return (int) answer;
//             // int
//         }
//         return -1;
//     }
// }

class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int)answer;
    }
} 


// class Solution {
//     public int solution(int num1, int num2) {
//         int answer = -1;
//         if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
//             double test = (double) num1 / num2 * 1000; 
//             answer = (int) test; 
//         }
//         return answer; 
//     }
// }

