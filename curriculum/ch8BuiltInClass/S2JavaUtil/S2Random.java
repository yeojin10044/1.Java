package curriculum.ch8BuiltInClass.S2JavaUtil;

import java.util.Random;

public class S2Random {
    // Random 클래스의 인스턴스 생성
    public static void main(String[] args) {
        // Random 객체 생성
        Random random = new Random();

        // 1. 정수 범위 내에서 난수 생성
        int randomNumber = random.nextInt(); // 모든 int 범위에서 난수 생성
        System.out.println("Random Integer: " + randomNumber);

        // 2. 특정 범위 내에서 난수 생성
        int minRange = 1;
        int maxRange = 100;

      int randomInRange = random.nextInt(maxRange - minRange + 1) + minRange;
        //99
        //        int randomInRange = random.nextInt(maxRange - minRange); //nextInt (99): 0~99(0을 포함하고 99를 포함하지 않는다.
//        int randomInRange = random.nextInt(maxRange - minRange +1); //nextInt (100) 0~100
//        int randomInRange = random.nextInt(maxRange - minRange +1) +minRange

        System.out.println("Random Integer in Range [" + minRange + ", " + maxRange + "]: " + randomInRange);

        // 3. 난수 생성 후 double 형태로 변환
        double randomDouble = random.nextDouble(); // 생성범위 0이상 1미만
        System.out.println("Random Double: " + randomDouble);

        // 4. boolean 값으로 난수 생성
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }

}
