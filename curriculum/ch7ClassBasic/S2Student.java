package curriculum.ch7ClassBasic;
// S2Student 클래스 정의
// 클래스는? 데이터와 메소드의 조합
public class S2Student {
//    클래스 멤버 변수 선언
// 멤버 변수: 클래스에서 처리하는 데이터
//클래스 내부에서 알크 인서트 컨스트럭터 쉬프트 전체 엔터 하면 만들어짐
    String name;
    int koreanScore;
    int englishScore;
    int mathScore;


    // 클래스 생성자 메서드
// 생성자란? 객체를 생성하고 클래스의 멤버변수를 초기화하는
// 기능을 수행하는 메소드

    public S2Student(String name, int koreanScore, int englishScore, int mathScore) {
       //This 로 맴버변수 메소드에 접근 가능 생성된 객체 자신을 가르킨다.
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
// 클래스 메소드 정의
    public double calculateAverage(){
        // koreanScore,englishScore,mathScore는 클래스의 멤버 변수로
        // 접근 가능하다.
        return (koreanScore + englishScore + mathScore) / 3.0;
    }
}
