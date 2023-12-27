package curriculum.ch1VariableTypes;

public class S2TypeCasting {
    public static void main(String[] args) {
        /*
        암시적 타입 캐스팅 (묵시적 변환, Implicit Casting):

        작은 데이터 타입에서 큰 데이터 타입으로의 변환은 자동으로 이루어집니다.
        데이터의 손실이 없거나 무시될 수 있는 경우에 사용됩니다.
         */

        // 암시적 타입 캐스팅 (int -> double)
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("암시적 타입 캐스팅 - doubleValue: " + doubleValue);

        /*
   명시적 타입 캐스팅 (강제적 변환, Explicit Casting):

큰 데이터 타입에서 작은 데이터 타입으로의 변환은 명시적으로 지정해야 합니다.
데이터의 손실이 발생할 수 있으므로 주의가 필요합니다.
         */
        // 명시적 타입 캐스팅 (double -> int)
        double doubleValue2 = 10.5;
//        int intValue2 =  doubleValue2; // 명시적 타입 캐스팅을 지정하지 않으면 컴파일 에러가 발생한다.
        int intValue2 = (int) doubleValue2;
        System.out.println("명시적 타입 캐스팅 - intValue2: " + intValue2);
    }
}
