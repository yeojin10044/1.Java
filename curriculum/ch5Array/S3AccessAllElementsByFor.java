package curriculum.ch5Array;

public class S3AccessAllElementsByFor {
    public static void main(String[] args) {
        // 정수형 배열 선언 및 생성
        int[] numbers = new int[5];

        // 배열에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // for문을 사용한 배열 요소 출력
        System.out.println("정수형 배열 값:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
