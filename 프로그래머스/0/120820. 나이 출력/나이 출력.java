import java.util.Scanner;

public class Solution {
    public int solution(int age) {
        int answer = 2022 - age + 1; 
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 나이는? "); 
        int age = scanner.nextInt(); 

        // Solution 클래스의 인스턴스를 생성하여 solution 메서드 호출
        Solution solution = new Solution();
        int birthYear = solution.solution(age);

        System.out.println("당신은 " + birthYear + "년에 태어났습니다."); 
        scanner.close();
    }
}
