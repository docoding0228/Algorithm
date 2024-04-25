import java.util.Scanner;

public class Solution {
    // 태어난 연도를 계산하는 메서드
    public int solution(int age) {
        int answer = 2022 - age + 1; // 주어진 나이로 태어난 연도 계산
        return answer; // 계산 결과 반환
    }

    public static void main(String[] args) {
        // 사용자로부터 나이를 입력받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 나이를 물어보기
        System.out.print("당신의 나이는 몇 살인가요? "); 
        int age = scanner.nextInt(); // 입력받은 값을 정수로 저장

        // Solution 클래스의 인스턴스를 생성하여 solution 메서드 호출
        Solution solution = new Solution();
        int birthYear = solution.solution(age); // 계산된 태어난 연도

        // 결과를 사용자에게 보여주기
        System.out.println("당신은 " + birthYear + "년에 태어났습니다."); 
        
        // 리소스 누수를 방지하기 위해 Scanner 닫기
        scanner.close();
    }
}