package curriculum.ch5Array;

public class S4AccessOutOfBound {
    public static void main(String[] args) {
        // 정수형 배열 선언 및 생성
        int[] numbers = new int[5];

        // 배열에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
//        아래 코드가 실행된다면 런타임 에러가 발생한다.
//      배열의 범위를 넘어선 곳에 값을 쓰려고 하기 때문이다.
//        numbers[5] = 60;

        // for문을 사용한 배열 요소 출력
        System.out.println("정수형 배열 값:");
        for (int i = 0; i < numbers.length; i++) {
//      아래 코드가 실행된다면 런타임 에러가 발생한다.
//      배열의 범위를 넘어선 곳에 값을 읽으려고 하기 때문이다.
//        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
