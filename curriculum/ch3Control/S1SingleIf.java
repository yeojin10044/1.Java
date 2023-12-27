package curriculum.ch3Control;

public class S1SingleIf {
/*
	제어문(Control Statement)은 프로그램의 흐름을 제어하는 구조를 제공
 */
	public static void main(String[] args) {
		
		int score = 60;
		
		System.out.println("시험 시작");
		if (score >= 60) { // 참인 경우에 대한 처리만 할 경우
			System.out.println("합격입니다.");
		}
		System.out.println("시험 끝");

	}

}
