package curriculum.ch8BuiltInClass.s1JavaLangPkg;

public class S3StringModify2 {
    public static void main(String[] args) {
        String str1 ="abcd";
// 객체의 메모리 주소를 기반으로 해시 코드를 생성 => 유니크(유일한) 값
        str1 =  str1 + "efg";
// 과거에 생성되었던 "abcd"는 이제 더 이상 참조할 수 없는 가비지로 남게되어
// 불필요한 메모리 공간을 차지하게 된다.
// C/C++ 언어에서는 메모리에 생성된 값을 해제할 수 있는 함수가 제공되지만
// 자바에서는 가비지컬렉터가 임의로 수행을 하게되어 주의가 필요하다.
        System.out.println("str1 = "+System.identityHashCode(str1));
    }
}
