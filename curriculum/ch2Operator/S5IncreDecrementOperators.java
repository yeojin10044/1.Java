package curriculum.ch2Operator;

public class S5IncreDecrementOperators {
    public static void main(String[] args) {
        /*
        증감 연산자(Increment Operator): 변수값을 증가시키는데 사용하는 연산자
        감소 연산자(Decrement Operator): 변수값을 감소시키는데 사용하는 연산자.

        전위 연산자 (Pre-Increment Operator): 연산자가 변수 앞에 위치하면,
        변수의 값을 증가 또는 감소한 후에 다른 연산을 수행한다.
        후위 연산자 (Post-Decrement Operator): 연산자가 변수 뒤에 위치하면,
        다른 연산에 먼저 참여한후 값을 증가 또는 감소한다.

         */
        int x = 5;

        System.out.println("x: " + (++x)); // 먼저 x를 1 증가시킨후 println 함수 수행
        System.out.println("x: " + (--x)); // 먼저 x를 1 감소시킨후 println 함수 수행
        System.out.println("x: " + x); // 현재 x 값

        int y = 10;
        System.out.println("y: " + (y++)); // 먼저 println 함수 수행하고 다음 라인에서 y값을 증가
        System.out.println("y: " + (y--)); // 먼저 println 함수 수행하고 다음 라인에서 y값을 감소
        System.out.println("y: " + y); // 현재 x 값

    }
}
