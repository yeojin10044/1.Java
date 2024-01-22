package curriculum.ch7ClassBasic;
public class S1StudentManagerNoClass {

    public static void main(String[] args) {
        // 학생 정보 변수 선언
        String name = "홍길동";
        int koreanScore = 90;
        int englishScore = 85;
        int mathScore = 95;
//        String StudentInfo = {"홍길동",90};
//        int[] StudentInfo = {"홍길동",90,85,95};

        // 각 학생의 평균 출력

        System.out.println(name + "의 평균 점수: " + calculateAverage(koreanScore, englishScore, mathScore));
    }

    // 평균 계산 메서드
    public static double calculateAverage(int koreanScore, int englishScore, int mathScore) {
        // 국어, 영어, 수학 점수의 평균을 계산하여 반환
        return (koreanScore + englishScore + mathScore) / 3.0;
    }
}
