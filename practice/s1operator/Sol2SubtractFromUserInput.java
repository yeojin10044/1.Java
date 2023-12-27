/*
두 수의 뺄셈을 계산하여 화면에 출력하는 프로그램을 작성하세요.

- 사용자 입력은 prompt 함수를 사용한다.
- 출력은 document.write 사용

* 브라우저 입력 예시
 첫 번째 프롬프트:
첫 번째 숫자를 입력하세요
1

 두 번째 프롬프트:
두 번째 숫자를 입력하세요
2

* 브라우저 출력 예시
두 수의 차는: -1
 */
package practice.s1operator;
// Scanner를 사용하기 위한 패키지 import
import java.util.Scanner;
public class Sol2SubtractFromUserInput {
    public static void main(String[] args) {
        // 사용자로부터 두 수를 입력받음
        // 지금은 Scanner 사용자 입력을 받기 위한 클래스
        // 지금은 사용자 입력을 받기 위한 자료형 변수 정도로만 이해하고
        // 아래와 같이 관용적으로 사용한다는 정도로 이해하자
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // scanner.nextLine()
        // scanner에는 많은 사용자 입력기능을 제공한다.
        // nextLine은 줄단위로 문자를 읽는다.
        // nextLine을 사용하기 위해 지금은 관용적으로 scanner.nextLine()을 사용한다라고
        // 이해하자
        String input1 = scanner.nextLine();


        System.out.print("두 번째 숫자를 입력하세요: ");
        String input2 = scanner.nextLine();

        // 입력받은 문자열을 숫자로 변환
        // 숫자변환 기능을 사용하기 위해 지금은 아래와 같이 관용적으로
        // 사용한다고 이해하자.
//        double num1 = Double.parseDouble(input1);
//        double num2 = Double.parseDouble(input2);
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        // 두 수를 뺀 결과를 출력
        int result = num1 - num2;
        System.out.println("두 수의 차는: " + result);

        // Scanner를 닫아줌
        scanner.close();
    }
}
