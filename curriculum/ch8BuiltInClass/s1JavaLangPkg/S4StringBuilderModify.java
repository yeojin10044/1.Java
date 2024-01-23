package curriculum.ch8BuiltInClass.s1JavaLangPkg;

public class S4StringBuilderModify {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("abcd");
        StringBuilder str2 = new StringBuilder("abcd");

// 객체의 메모리 주소를 기반으로 해시 코드를 생성 => 유니크(유일한) 값
        System.out.println("str1 = " + System.identityHashCode(str1));
        System.out.println("str2 = " + System.identityHashCode(str2));

        str1.append("efg");


// str1이 이미 StringBuilder로 생성되었기 때문에 새로운 문자열이 기존의 객체를 수정하게 됩니다.
        System.out.println("str1 = " + System.identityHashCode(str1));

        String str3="abc";
        str3 = str3+"def";
// 참고로 StringBuilder는 + 연산을 지원하지 않아 간단한 문자열에 대한 수정작업의 편의성은 떨어질 수 있다.
//        str1 = str1+"test";
    }
}
