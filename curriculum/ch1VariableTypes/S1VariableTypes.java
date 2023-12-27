package curriculum.ch1VariableTypes;

public class S1VariableTypes {
    public static void main(String[] args) {
               /*

//* 변수 (Variables)
//변수는 값을 저장하는 메모리 공간을 가리키며,
//프로그램에서 데이터를 임시로 저장하고 조작하는 데 사용됩니다.
//자바에서 변수는 선언, 초기화, 그리고 사용하는 단계로 이루어집니다.
//
//* 자료형: 자바에서는 변수의 자료형을 명시하여 해당 변수가 어떤 종류의 데이터를
//  저장하는지를 지정합니다. 주요 자료형은 다음과 같습니다.
//
// - 정수형 (Integer Type)
//  byte: 가장 작은 범위 (-128 ~ 127)
//  short: 보다 큰 범위 (-32,768 ~ 32,767)
//  int: 일반적인 범위 (-2^31 ~ 2^31 - 1)
//  long: 가장 큰 범위 (-2^63 ~ 2^63 - 1)
//
// - 실수형 (Float-Point Types):
//   float: 32비트 부동소수점 (1.4 x 10^-45 ~ 3.4 x 10^38)
//   double: 64비트 부동소수점 (4.9 x 10^-324 ~ 1.8 x 10^308)
//
// - 문자형 (Character Type): 문자를 표현한다.
//
// - 논리형(Boolean Type): true, false (참, 거짓) 표현
// */
//
//// 변수 선언 문법
//// [자료형] 변수명
//// 자료형: 데이터의 타입 (숫자, 실수, 문자, True/False 등등..)
//
//// 변수 선언부
//// 정수형 변수 선언
        int age;

// 실수형 변수 선언
        double height;

// 변수 초기화
        age =25;
        height = 175.5;

        float  weight = 68.5f;  // 실수인 경우 숫자 뒤에 f를 붙인다.
        char grade = 'A'; // char: 하나의 문자를 처리
// bolean 타입의 변수먕 작성 is명사 : 이런식의 명수명을 flag변수
        boolean isStududent = true;

// 변수 사용
        System.out.println("나이: "+ age);
        System.out.println("키: "+height + "cm");
        System.out.println("체중 "+ weight + "kg");
        System.out.println("학점: " + grade);
        System.out.println("학생 여부: " + isStududent);

        // 문자타입
        // 문자 리터럴을 사용하여 문자 변수 생성
        String str1 = "Hello, World!";
        System.out.println(str1);

        // String 클래스를 사용하여 문자 생성
        String str2 = new String("Hello, Wrold!");
        System.out.println(str2);

        String str3 = new String("Hello, Wrold!");
        System.out.println(str3);

        String str4 = "Hello, World";
        System.out.println(str4);

        if (str1 == str4){
            System.out.println("같아요.(주소가 같아요)");
        }
        if(str2 == str3){
            System.out.println("같아요.(주소가 같아요)");
        }
        if (str2.equals(str3)){
            System.out.println("같아요.(값이 같아요)");
        }

        // 위 두가지 방법 모두 문자열을 생상하는 문밥이다.
        // 첫번째 방식으로 생성하면 문자열이 String 풀이라는 곳에 관리되어 중복된 문자열을 공우하여
        // 메모리를 절약할 수 있다.
        // 지금은 문자열 생성하는 방법이 두가지가 있는 정도로만 확인하자.

    }
}

