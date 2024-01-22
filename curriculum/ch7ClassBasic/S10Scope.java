package curriculum.ch7ClassBasic;
/*
 - 변수 Scope: 변수를 접근할 수 있는 유효범위

 - 원칙
  + 안쪽 블록에서 바깥쪽 블록의 변수 참조 가능
  + 그 반대는(바깥쪽 블록에서 안쪽 블록) 불가능
*/
public class S10Scope {
    static String className = "S10Scope"; // 1. 클래스 블럭 내에서 사용 가능한 변수

    public static void main(String[] args) { // 2. main 메서드 블럭

        String methodName="main"; // 2. main 메서드 블럭 내에서 사용 가능한 변수

        // 메서드 블록에서 상위 블록(클래스)의 변수에 대한 접근(읽기/쓰기)
        System.out.println(className);
        className = "S11Scope";
        System.out.println(className);

        if (true) {
            // 하위 블록 (if, for, while등)에서 상위 블록(클래스, 메소드) 변수 접근
            System.out.println(className);
            System.out.println(methodName);
            methodName = "public static void main";
            System.out.println(methodName);

            // if문 블럭안에서 변수 선언
            String email = "hong@test.com";
        }
        // 상위 블록에서 하위 블록의 변수 접근
        // if문 블럭 밖에서 email 변수를 사용하면 에러 발생
        // System.out.println(email);
        // email = "hong@test.com";
    }
}
