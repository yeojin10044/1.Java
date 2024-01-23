package curriculum.ch8BuiltInClass.s1JavaLangPkg;

public class S7StringAppendTest {

	public static void main(String[] args) {

		// 시작
		long start = System.currentTimeMillis();

		String str = "";
		for (int i=0; i<100000; i++) {
			str += i;
		}
		
		// 끝
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start ));

	}

}
