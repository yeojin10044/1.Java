package curriculum.ch6Method.s1WhyMethod;

public class Method4 {
    /*
	- 메소드란?
	클래스에서 특정 목적을 수행하기 위해 모듈화된 명령어 블록
			(블록: { }으로 묶인 명령어 집합)
			(참고] 자바코드는 모두 클래스로 작성이 되므로 함수라는 말 대신 메소드라는 용어를 사용한다.)
			- 메소드 사용 목적
	코드를 논리적으로 그룹화하여 가독성과 재사용성을 높인다.
	*/
// 명령문 6라인
    public static void main(String[] args) {
        String[] nameList = {"James","Bruno","Evan","George","Henry"};

        for (String name : nameList){
            sayHello(name);
        }
    }

    private static void sayHello(String name) {
        System.out.println(name + "님 안녕하세요.");
        System.out.println("교실에 입장하셨습니다.");
        System.out.println("출석체크하세요.");
        System.out.println("오늘도 화이팅입니다.\n");

//        Scope란
//        변수가 접근할수 있는 범위에 대한 규칙
//        접근할 수 있는 범위는 블록{}
//        같은 블록안에 변수를 사용할 수가 있어요.
//        {
//            Sting name;
//            name = "Hello";
//	... println(name);
//        }
//        상위 스코프, 하위스코프
//        {
//            // 상위 스코프
//            {
//                // 하위 스코프
//            }
//        }
//        상위 스코프(바깥족에 있는 {})에 정의된 변수는
//        하위스코프(안쪽에 있는 {})에서 접근 가능
//        {
//            // 상위 스코프
//            String name;
//            {
//                // 하위 스코프
//                name="Hello";
//		.println(name);
//            }
//        }
//        그 반대는 X
//        {
//            // 상위 스코프
//            {
//                // 하위 스코프
//                Sting name;
//
//            }
//            name ="hello"; // 에러
//	.println(name); // 에러
        }

    }

