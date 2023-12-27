package curriculum.ch4Loop;

public class S6ContinueEx1 {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
