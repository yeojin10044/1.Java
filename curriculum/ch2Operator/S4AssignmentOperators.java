package curriculum.ch2Operator;

public class S4AssignmentOperators {
    public static void main(String[] args) {
/*
 * 대입연산자(Assignment Operators)
  변수에 값을 할당하는 데 사용한다.
  = 기호를 사용하며, 왼쪽에는 변수가 오고 오른쪽에는 변수에 저장될 값이 옵니다.
*/
        int x;       // 변수 선언
        x = 10;      // 대입 연산자를 사용하여 변수에 값 할당
        int y = 10;  // 변수 선언과 동시에 값 할당

        System.out.println("x: " + x + " y: " +y);
/*
    += (덧셈 대입 연산자):
    a += b는 a = a + b와 동일합니다.
 */
        int a = 5;
        System.out.println("a: "+a);
        a += 3; // x는 이제 8 (5 + 3)
        System.out.println("a: "+a);

        int b = 5;
        System.out.println("b: "+b);
        b += 3; // x는 이제 8 (5 + 3)
        System.out.println("b: "+b);
    }
/*
    -= (뺄셈 대입 연산자):
    a -= b는 a = a - b와 동일합니다.
 */
}
