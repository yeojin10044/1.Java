package practice.s1operator;
// Scanner를 사용하기 위한 패키지 import
import java.util.Scanner;

public class Sol2SubtractFromUserInput2And3lnt {
    public static void main(String[] args) {
        // 사용자로부터 두 수를 입력받아 숫자로 변환
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt(); // 입력된 문자를 실수로 변환

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 두 수를 빼고 결과를 출력
        int result = num1 - num2;
        System.out.println("두 수의 차는: " + result);

        // Scanner를 닫아줌
        scanner.close();
    }
}
