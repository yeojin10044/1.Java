package curriculum.ch2Operator;

public class S3LogicalOperators {
    public static void main(String[] args) {
/*
 * 논리연산자(Logical Operators)
  - 논리곱(AND) 연산자 (&&): 엄격한 조건 검사
     && 연산자는 양쪽 피연산자(연산을 당하는 값)가 모두 참일 경우에만 전체 식이 참이 됩니다.
     하나라도 거짓이면 전체 식은 거짓이 됩니다.
  - 논리합(OR) 연산자 (||): 유연한 조건 검사
    || 연산자는 양쪽 피연산자 중 하나만 참이면 전체 식이 참이 됩니다.
    두 피연산자가 모두 거짓일 경우에만 전체 식이 거짓이 됩니다.
  - 논리부정(NOT) 연산자 (!):
    ! 연산자는 피연산자의 논리값을 반전시킵니다.
    * 참이면 거짓으로, 거짓이면 참으로 변환합니다.
*/
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1: " + condition1);
        System.out.println("condition2: " + condition2);

        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;
        boolean notResult = !condition1;

        System.out.println("condition1 && condition2 : " + andResult); // false
        System.out.println("condition1 || condition2 : " + orResult);  // true
        System.out.println("!condition1 : " + notResult);             // false
    }
}
