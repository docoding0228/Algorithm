// import java.util.Arrays;
// import java.util.Collections;

// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         String[] str = s.split("");
//         Arrays.sort(str, Collections.reverseOrder());
        
//         for(String a : str)
//            answer += a;
//         return answer;
//     }
// }

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuffer sb = new StringBuffer(new String(arr));
        String answer = sb.reverse().toString();
        
        return answer;
    }
}
