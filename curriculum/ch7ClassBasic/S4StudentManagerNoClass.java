package curriculum.ch7ClassBasic;
public class S4StudentManagerNoClass {

    public static void main(String[] args) {
        // 그 이전 구조와 다르게 개발자B와 개발자C는
        // 학생 속성에 대한 정보와 분석기능을 관리자 A에게 전달 받아 구현해야 하는 부담을 안게 되었습니다.
        // 중간에 학생 속성 정보와 분석기능 관련 메뉴얼이 변경이 되어야 한다면 개발자B와 개발자C는
        // 학생관련 속성 및 메소드를 동일하게 실수없이 작성해야 합니다.
        // 학생 정보 변수 선언
        String name = "홍길동";
        int koreanScore = 90;
        int englishScore = 85;
        int mathScore = 95;

        // 각 학생의 평균 출력
        double average = calculateAverage(koreanScore, englishScore, mathScore);
        System.out.println(name + "의 평균 점수: " + average);

        // 학생의 등급 출력
        String grade = getGrade(average);
        System.out.println(name + "의 등급: " + grade);

        // 합격 여부 출력
        boolean isPass = isPass(average);
        if (isPass) {
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("귀하는 불합격입니다.");
        }
    }

    // 평균 계산 메서드
    public static double calculateAverage(int koreanScore, int englishScore, int mathScore) {
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    // 등급 반환 메서드
    public static String getGrade(double average) {
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

    // 합격 여부 판단 메서드
    public static boolean isPass(double average) {
        return average >= 80.0;
    }
}
