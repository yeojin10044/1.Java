package curriculum.ch7ClassBasic;

public class S7StaticVariableMethod {
/*
    - static 변수/static 함수 란?
     객체를 생성하지 않고 사용할 수 있는 변수, 함수로써 모든 인스턴스(실제로 메모리에 생성된 객체)에서
     공유된 static 변수, 함수를 사용함으로써 중복적인 변수 사용을 하지 않아도 되어 메모리 사용을
     효율적으로 하게 된다.
*/
    // static 변수 선언
    static int staticVariable = 0;

    // static 함수 선언
    // 이 함수는 static 변수를 증가시키고 현재 static 변수의 값을 반환합니다.
    // static 함수에서는 클래스의 인스턴스에 접근할 수 없으며, 주로 클래스 수준의 작업에 사용됩니다.

    static int incrementStaticVariable() {
        staticVariable++;
        return staticVariable;
    }

}
