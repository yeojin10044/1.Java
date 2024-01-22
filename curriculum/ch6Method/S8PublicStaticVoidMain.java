package curriculum.ch6Method;

public class S8PublicStaticVoidMain {
/*
    이제 다시 main 메소드를 다시 보면
    S8PublicStaticVoidMain 클래스의 객체를 생성하지 않아도 시작되는 함수임을 확인 할 수 있다.
 */
    public static void main(String[] args) {

        sayHello();
    }

/*
    또한 아래 sayHello() 함수도 객체 생성하지 않고 내부적으로
    테스트를 위해 사용가능한 함수의 용도로 활용되었음을 알 수 있다.
*/
    private static void sayHello() {
        System.out.println("Hello World!");
    }
}
