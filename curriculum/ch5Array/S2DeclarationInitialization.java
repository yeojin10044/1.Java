package curriculum.ch5Array;

public class S2DeclarationInitialization {
    public static void main(String[] args) {
        // 선언과 동시에 배열 초기화
// 정수형 배열 선언과 초기화
        int[] numbers = {1, 2, 3, 4, 5};

// 문자열 배열 선언과 초기화
        String[] names = {"Alice", "Bob", "Charlie"};

// 정수형 배열 값 출력
        System.out.println("정수형 배열 값:");
        System.out.println(numbers[0]); // 10
        System.out.println(numbers[1]); // 20
        System.out.println(numbers[2]); // 30
        System.out.println(numbers[3]); // 40
        System.out.println(numbers[4]); // 50

// 문자열 배열 값 출력
        System.out.println("문자열 배열 값:");
        System.out.println(names[0]);   // John
        System.out.println(names[1]);   // Jane
        System.out.println(names[2]);   // Doe
    }
}
