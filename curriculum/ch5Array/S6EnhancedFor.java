package curriculum.ch5Array;

public class S6EnhancedFor {

    public static void main(String[] args) {
        // 정수형 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 향상된 for문을 사용하여 배열 순회
        System.out.println("배열 요소 출력:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 문자열 배열 선언 및 초기화
        String[] names = {"Alice", "Bob", "Charlie"};

        // 향상된 for문을 사용하여 문자열 배열 순회
        System.out.println("문자열 배열 요소 출력:");
        /*
        배열의 개별 요소를 : 앞에 변수명으로 지정하면
        반복문이 돌면서 배열의 개별요소를 순서대로 재할당해 준다.
        for (변수타입 변수명 : 배열 또는 컬렉션) {
             반복 실행할 코드
        }
         */
        for (String name : names) {
            System.out.println(name);
        }
    }
}
