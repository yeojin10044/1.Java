package curriculum.ch8BuiltInClass.s1JavaLangPkg;

public class S8StringBuilderAppendTest {

	public static void main(String[] args) {

		// 시작
		long start = System.currentTimeMillis();

		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<100000; i++) {
			sb.append(i);
		}
		
		
		// 끝
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start ));

		// 결론: StringBuffer가 String 보다 수정 속도가 빠르다 (참고로 읽기 성능도 StringBufer가 좋거나 비슷한 성능을 보인다.)
	}

}
