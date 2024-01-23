package curriculum.ch8BuiltInClass.S2JavaUtil;
import java.util.Scanner;
public class S1Scanner {
    public static void main(String[] args) {
        // System.in은 표준 입력 스트림(System.in)으로부터 데이터를 읽을 수 있도록 해줍니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 입력을 요청하는 메시지 출력
        System.out.print("이름을 입력하세요: ");

        // 사용자가 입력한 문자열을 읽어와서 변수에 저장
        String name = scanner.nextLine();

        // 사용자에게 입력을 요청하는 메시지 출력
        System.out.print("나이를 입력하세요: ");

        // 사용자가 입력한 정수를 읽어와서 변수에 저장
        int age = scanner.nextInt();

        // 사용자에게 입력을 요청하는 메시지 출력
        System.out.print("키를 입력하세요 (소수점까지 가능): ");

        // 사용자가 입력한 실수를 읽어와서 변수에 저장
        double height = scanner.nextDouble();

        // 입력이 끝났으므로 Scanner를 닫아줍니다.
        scanner.close();

        // 사용자로부터 받은 입력값을 출력
        System.out.println("입력된 정보:");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
    }
}
