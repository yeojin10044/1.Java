package curriculum.ch5Array;

public class S5ArrayCopy {

	public static void main(String[] args) {

		copyByFor();

		copyByArrayCopy();

	}

	private static void copyByArrayCopy() {
		// 원본 배열
		int[] arrInt = {1,2,3};

		// 복사할 배열
		int[] arrInt2 = new int[5];

		System.arraycopy(arrInt, 0, arrInt2, 0, arrInt.length);

		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

	private static void copyByFor() {
		// 원본 배열
		int[] arrInt = {1,2,3};

		// 복사할 배열
		int[] arrInt2 = new int[5];

		// 복사할 배열에 값 대입
		for (int i=0; i<arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}

		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

	// System은 java.lang 패키지에서 제공하는 클레스
	// 자동으로 제공하여 사용할수 있는 클래스
	// arrIntSrc(복사할배열이름, 복사할 곳의 위치, 붙여넣을배열이름, 붙여넣을 배열위치, 복사할 사이즈)



}
