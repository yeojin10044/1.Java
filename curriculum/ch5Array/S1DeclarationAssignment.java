package curriculum.ch5Array;

public class S1DeclarationAssignment {
    public static void main(String[] args) {
        // new로 생성
        // 정수형 배열 선언 및 생성
        // 배열의 크기는 생성될 당시 고정된다.
        // 배열 선언 문법
        // 자료형[] 배열변수명 = new 자료형[배열의크기]
        int[] numbers = new int[5];

        // 문자열 배열 선언 및 생성
        String[] names = new String[3];

        // 정수형 배열에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

// 문자열 배열에 값 할당
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Doe";

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
