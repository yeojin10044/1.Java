package curriculum.ch7ClassBasic;

public class S7StaticMain {
    public static void main(String[] args) {
        // static 변수와 static 함수 사용

        // static 변수는 클래스 이름을 통해 직접 접근할 수 있습니다.
        System.out.println("초기 static 변수 값: " + S7StaticVariableMethod.staticVariable);

        // static 함수 호출
        int result = S7StaticVariableMethod.incrementStaticVariable();
        System.out.println("static 함수 호출 후 static 변수 값: " + result);

        // 다시 static 함수 호출
        result = S7StaticVariableMethod.incrementStaticVariable();
        System.out.println("또 다시 static 함수 호출 후 static 변수 값: " + result);
    }
}
