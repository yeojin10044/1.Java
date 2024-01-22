package curriculum.ch8BuiltInClass.s1JavaLangPkg;
// java.lang pakage 내장 클래스: import 사용하지 않아도 사용가능

public class S1System {

	public static void main(String[] args) {

		// currentTimeMillis
		// 현재 시간을 밀리초로 반환합니다. 성능 측정에 사용됩니다.
		long currentTime = System.currentTimeMillis();
		System.out.println("현재 시간 (밀리초): " + currentTime);

		// exit: 프로그램 종료
		System.out.println("프로그램을 종료합니다.");
		System.exit(0); // 정상 종료
		System.out.println("남은 작업");

		// getProperty(String key) 메서드:
		//시스템 속성 중 주어진 키에 해당하는 값을 반환합니다.
		String javaVersion = System.getProperty("java.version");
		System.out.println("Java 버전: " + javaVersion);
//		for (String var : System.getenv().keySet()) {
//			System.out.println(var + "=" + System.getenv(var));
//		}
	}

}
