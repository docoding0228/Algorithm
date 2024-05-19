// class Solution {
//     public int[] solution(int[] arr) { 
//         if(arr.length == 1){
//             int[] answer = {-1};
//             return answer;
//         }
        
//         int min = arr[0];
//         int[] answer = new int[arr.length -1];
        
//         for(int i=0; i<arr.length; i++){
//             min = Math.min(min,arr[i]);
//         }
        
//         int idx = 0;
//         for(int i=0; i<arr.length; i++){
//             if(min == arr[i]){
//                 continue;
//             }else{
//             	answer[idx++] = arr[i];
//             }
//         }
//         return answer;
//     }
// }

// import java.util.*;
// import java.util.stream.Collectors;

// class Solution {
//     public int[] solution(int[] arr) {
//         List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//         Arrays.sort(arr);
//         list.remove(list.indexOf(arr[0]));
//         if (list.size() <= 0) return new int[]{-1};
//         return list.stream().mapToInt(i->i).toArray();
//     }
// }

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}

