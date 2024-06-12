// import java.util.*;
// class Solution {
// 	public static int[] solution(int[] array, int[][] commands) { 
// 		int[] answer = new int[commands.length]; // 3
// 		int n = 0;
		
// 		for (int i = 0; i < commands.length; i++) {
// 			int k = 0;
// 			int[] list = new int[commands[i][1] - commands[i][0] + 1]; 
      
// 			for (int j = commands[i][0]; j <= commands[i][1]; j++) { 
// 				list[k++] = array[j - 1];
// 			}
// 			Arrays.sort(list);
// 			answer[n++] = list[commands[i][2] - 1];
// 		}
// 		return answer;
// 	}
// }

import java.util.*;
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < commands.length; i++) {
			for (int j = commands[i][0]; j <= commands[i][1]; j++) { 
				list.add(array[j-1]);
				Collections.sort(list); // ArrayList 오름차순 정렬
			}
			answer[i] = list.get(commands[i][2] - 1); 
			list.clear();
		}

		return answer;
	}
}