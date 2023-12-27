package curriculum.ch6Method.s1WhyMethod;

import java.util.Scanner;

public class Quiz1 {
//    문제1] 두 정수를 입력받아서 두 수의 합, 차, 곱, 몫, 나머지를 출력하는 함수를 작성해보세요.
//- 함수명: add, subtract, multiply, divide, modulo
//- 모두 매개변수(인자)와 리턴이 있는 함수로 작성하세요.
//
//            * 화면 출력
//    첫 번째 정수를 입력하세요: 6
//    두 번째 정수를 입력하세요: 3
//    두 수의 합: 9
//    두 수의 차: 3
//    두 수의 곱: 18
//    두 수의 몫: 2
//    두 수의 나머지: 0
    public  static  void main(String[] args) {

        int firstNum;
        int secondNum;
        int result;
        Scanner in = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요: ");
        firstNum = in.nextInt();

        System.out.print("두번째 수를 입력하세요: ");
        secondNum = in.nextInt();


    }

}
