package curriculum.ch7ClassBasic.mypkg;

public class scoreManagement {
    String studentName;

    int mathScore;

    int englishScore;

    int koreanScore;

    // 생성자 파트
    // 객체가 생성될때 자동으로 호출

    public scoreManagement(String studentName, int mathScore, int englishScore, int koreanScore) {
        // .<= 객체의 멤버 변수, 멤버 메소드에 접근하는 키워드
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.koreanScore = koreanScore;
    }

    public int averageScore() {
        int result = 0;

        result = (this.englishScore + this.mathScore + this.koreanScore) / 3;

        return result;
    }

    public String provideLevel() {
        String result = "";

        int averageScore = averageScore();

        if (averageScore >= 90 && averageScore <= 100) {
            result = "A";
        } else if (averageScore >= 80 && averageScore < 90) { // "B"등급
            result = "B";
        } else if (averageScore >= 70 && averageScore < 80) { // "C"등급
            result = "C";
        } else if (averageScore >= 60 && averageScore < 70) { // "D"등급
            result = "D";
        } else {
            result = "F";
        }

        return result;
    }
}
