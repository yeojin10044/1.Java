package curriculum.ch7ClassBasic;

public class S9Student {

    // 클래스 멤버 변수 선언
    String name;          // 학생 이름
    int koreanScore;      // 국어 점수
    int englishScore;     // 영어 점수
    int mathScore;        // 수학 점수

    // 추가: 클래스 멤버(static) 변수 선언
    static int totalStudents = 0;  // 전체 학생 수

    // 생성자 메서드
    public S9Student(String name, int koreanScore, int englishScore, int mathScore) {
        // 생성자를 통해 입력받은 값으로 멤버 변수 초기화
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;

        // 추가: 학생이 생성될 때마다 전체 학생 수 증가
        totalStudents++;
    }

    // 추가: 클래스 멤버(static) 메서드
    public static int getTotalStudents() {
        return totalStudents;
    }

    // 평균 계산 메서드
    public double calculateAverage() {
        // 국어, 영어, 수학 점수의 평균을 계산하여 반환
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    public void displayStudentInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("국어 점수: " + koreanScore);
        System.out.println("영어 점수: " + englishScore);
        System.out.println("수학 점수: " + mathScore);
        System.out.println("평균 점수: " + calculateAverage());
    }

    public String getGrade() {
        double average = calculateAverage();
        if (average >= 90.0) {
            return "A";
        } else if (average >= 80.0) {
            return "B";
        } else if (average >= 70.0) {
            return "C";
        } else if (average >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPass() {
        return calculateAverage() >= 80.0;
    }
}
