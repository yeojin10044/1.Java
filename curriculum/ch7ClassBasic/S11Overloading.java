package curriculum.ch7ClassBasic;
/*
 - 메소드 오버로딩 (Method Overloading)
 동일한 이름의 메서드를 여러 번 정의하되, 매개변수의 개수나 타입이 다르게 선언하는 것
 사용자는 동일한 메소드명을 통해 오버로딩된 메소드가 큰 틀에서는 같은 동작을 하지만
 인자를 다르게 설정하여 호출함으로써 오버도딩된 메소드의 기능이 세부적으로는 다르게 동작됨
 이러한 특징을 객체지향의 다형성(Polymorphism) 이라함

 */
public class S11Overloading {
    // 정수형 매개변수를 받는 메서드
    static int add(int a, int b) {
        return a + b;
    }

    // 실수형 매개변수를 받는 메서드 (오버로딩)
    static double add(double a, double b) {
        return a + b;
    }

    // 세 개의 정수형 매개변수를 받는 메서드 (오버로딩)
    static int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        // 정수형 매개변수를 사용하는 오버로딩
        System.out.println("정수형 덧셈 결과: " + add(5, 3)); // 출력: 8

        // 실수형 매개변수를 사용하는 오버로딩
        System.out.println("실수형 덧셈 결과: " + add(4.5, 2.5)); // 출력: 7.0

        // 세 개의 정수형 매개변수를 사용하는 오버로딩
        System.out.println("세 개의 정수형 덧셈 결과: " + add(2, 3, 4)); // 출력: 9

    }
}
