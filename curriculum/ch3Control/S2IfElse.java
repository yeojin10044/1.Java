package curriculum.ch3Control;

public class S2IfElse {

	public static void main(String[] args) {
		
		int score = 50;
		
		System.out.println("시험 시작");
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else { // if 조건이 거짓인 경우 처리
			System.out.println("불합격입니다.");
		}
		System.out.println("시험 끝");

	}

}
