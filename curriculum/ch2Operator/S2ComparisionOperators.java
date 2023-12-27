package curriculum.ch2Operator;

public class S2ComparisionOperators {
    public static void main(String[] args) {
        /*
         비교연산 (Comparision Operators)
         */
        int x = 5;
        int y = 10;

        System.out.println("x: " + x + ", y: " + y);
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y)); // x와 y가 다르다.
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y)); // x가 y보다 크거나 같다 (부등호가 먼저 오는 것에 유의
        System.out.println("x <= y : " + (x <= y)); // x가 y보다 크거나 같다 (부등호가 먼저 오는 것에 유의
    }
}
