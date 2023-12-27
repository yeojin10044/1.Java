package curriculum.ch2Operator;

public class S6TernaryOperator {
/*
자바에서의 삼항 연산자는 조건에 따라 두 가지 값을 선택하는데 사용됩니다.
문법:
 조건 ? 참일 경우의 값 : 거짓일 경우의 값

조건이 참이면 참일 경우의 값이 선택되고, 조건이 거짓이면 거짓일 경우의 값이 선택됩니다.
 */
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // 삼항 연산자를 사용하여 큰 값을 선택
        int max = (x < y) ? x : y;

        System.out.println("큰 값은: " + max);
    }
}
