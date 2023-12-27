package curriculum.ch6Method.s1WhyMethod;

public class Method3 {
    /*
	- 메소드란?
	클래스에서 특정 목적을 수행하기 위해 모듈화된 명령어 블록
			(블록: { }으로 묶인 명령어 집합)
			(참고] 자바코드는 모두 클래스로 작성이 되므로 함수라는 말 대신 메소드라는 용어를 사용한다.)
			- 메소드 사용 목적
	코드를 논리적으로 그룹화하여 가독성과 재사용성을 높인다.
	*/
    // 명령문 9라인

   public  static  void main(String[] args) {

       System.out.println("James님 안녕하세요.");
       // 명령문(실행문) 함수추출 단축키: ctrl +Alt + M (method)
       sayHello("James");
       sayHello("Bruno");
       sayHello("Evan");
       sayHello("George");
       sayHello("Henry");

   }

    private static void sayHello(String name) {
        System.out.println(name + "님 안녕하세요.");
        System.out.println("교실에 입장하셨습니다.");
        System.out.println("출석체크하세요.");
        System.out.println("오늘도 화이팅입니다.\n");
    }

}
