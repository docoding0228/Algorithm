// def solution(s):
//     if len(s) % 2 == 0:
//         answer = s[len(s)//2 - 1] + s[len(s)//2]
//     else:
//         answer = s[len(s)//2]
//     return  answer

// print(solution("abcde"))
// print(solution("qwer"))

class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if(length % 2 == 0) {
            answer = s.substring(length/2-1, length/2+1);
        } else {
            answer = s.substring(length/2, length/2+1);
        }
        return answer;
    }
}