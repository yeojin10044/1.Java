package curriculum.ch8BuiltInClass.s1JavaLangPkg;

public class S5StringBuilder {
    public static void main(String[] args) {
        // StringBuilder 생성
        StringBuilder sb = new StringBuilder("Hello");

        // append: 문자열 추가
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert: 특정 위치에 문자열 삽입
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // substring: 특정 위치의 문자열 반환
        System.out.println("SubString: " + sb.substring(6,10));

        // delete: 특정 범위의 문자열 삭제
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // reverse: 문자열 뒤집기
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // length: 현재 문자열의 길이 반환
        int length = sb.length();
        System.out.println("Length: " + length);

        // capacity: 현재 할당된 용량 반환
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // toString: StringBuilder를 String으로 변환
        String result = sb.toString();
        System.out.println("Result: " + result);
    }
}
