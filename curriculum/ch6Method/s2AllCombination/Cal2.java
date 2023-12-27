package curriculum.ch6Method.s2AllCombination;

import java.util.Scanner;

public class Cal2 {
	/*
	 - 메소드란?
	  클래스에서 특정 목적을 수행하기 위해 모듈화된 명령어 블록
	  (블록: { }으로 묶인 명령어 집합)
	  (참고] 자바코드는 모두 클래스로 작성이 되므로 함수라는 말 대신 메소드라는 용어를 사용한다.)
	 - 메소드 사용 목적
	  코드를 논리적으로 그룹화하여 가독성과 재사용성을 높인다.


     - 사용법]
	  함수(){ // 함수 정의부
	     명령어;
	      ...
	      명령어;
	  }
	  함수(); // 함수 호출부
	 함수를 정의하면 이후에 함수 호출부에 적절한 함수인자를 넣어 호출한다.

	 - 함수 정의 문법
	 [접근제어자] [키워드] [리턴값 타입] 함수명 ([파라메터]);
	 지금은 가장 기본이 되는 리턴타입과 파라메터 먼저 이해하자

	 - 메소드 입출력 조합 경우의 수
	  		리턴타입	파라메터
	  		  X       X		<= 여기 : 함수안에서 모든 입력, 프로그램 로직, 출력(활용)을 모두 처리하고자 할떄
	  		  X       O
	  		  O       X
	  		  O       O
	 */
	public static void addNumber() { // 함수 정의
		int firstNum = 0;
		int secondNum = 0;
		int result = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();

		result = firstNum + secondNum;

		System.out.println(firstNum + " + " + secondNum + " = " + result);
	}
// main 함수: 프로그램 시작할 때 최초로 호출되는 함수
// 리턴타입: 함수 호출 후 그 함수가 반환하는 값, 만약에 반환되는 값이 없다면 void로 명시
// [리턴타입] [함수명] (파라메터1, 파라메터2,.... 파라메터N){
// }
public static void main(String[] args) {
	System.out.println("main] debug1");
	// 함수사용법
	// 함수명(); <= 함수 호출, 함수의 실행문이 모두 수행되면 다시 자기 자리로 돌아온다.
	// 함수 사용의 목적
	// - 내가 작성하고자 하는 프로그램 로직을 구조화 할 수 있다.
	addNumber();
// 내가 작성하는 프로그램 로직을 모두 main함수에서 처리한다면 굉장히 큰 main 함수가 될 것이다.
//	minusNumber();
//	devideNumber();
//	multiplcaeNumber();
	System.out.println("main] debug2");
}

}
