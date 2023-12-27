package SmokeTest;

import java.util.Scanner;
// 프로그램의 목적: Debugger 실습용 예제
//Debugger란? 프로그림을 프로그램가 원하는 방식으로 수행을 도와
// 프로그램 알고리즘의 이해를 돕는 도구
// - 주로 사용하는 기능
//  => 변수 모니터링
//  => 스텝별 동작 확인
// - 시나리오
// * 중단점 지정: 라인 번호옆에 마우스 클릭
// * 중단점 해제: 중단점이 설정된 라인에 표시된 중단점을 마우스 클릭
// * 디버거 시작: Alt+Shift+F9 (디버거 중단: Ctrl+F2 또는 중단 아이콘), Shift+F9
// * Step Over: F8 (또는 아이콘) =>현재 선택된 실항문을 한줄 실행
// * Step Into : F7 => 현재 실행문에 있는 함수 내부로 이동
// * Step Out: Shift+F8 => 현재 수행중인 블록(반복문, 함수)을 빠져나온다.
public class SimpleJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();

        // 합을 계산하는 함수 호출
        int result = calculateSum(n);

        // 결과 출력
        System.out.println("1부터 " + n + "까지의 합: " + result);

        // 스캐너 닫기
        scanner.close();
    }

    // 1부터 n까지의 합을 계산하는 함수
    public static int calculateSum(int n) {
        int sum = 0;

        // 반복문을 통해 1부터 n까지의 수를 더함
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // 계산된 합 반환
        return sum;
    }
}
