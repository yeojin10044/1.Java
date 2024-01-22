package curriculum.ch7ClassBasic;
public class S6StudentManagerNoClass {
// S5StudnetManager 클래스와 비교했을 경우 코드가 훨씬 복잡해 진 것을 확인 할 수 있다.
    public static void main(String[] args) {
        // 5명의 학생 정보를 배열로 생성
        // 서로 다른 학생정보 타입에 대해서 같은 index로 입력해야 된다.
        // 이 부분에서 실수가 발생할 수 있다.
        String[] names = {"홍길동", "김철수", "이영희", "박지성", "손흥민"};
        int[] koreanScores = {90, 88, 76, 95, 82};
        int[] englishScores = {85, 92, 89, 87, 90};
        int[] mathScores = {95, 78, 91, 94, 88};

        // 각 학생의 정보 출력
        for (int i = 0; i < names.length; i++) {
            displayStudentInfo(names[i], koreanScores[i], englishScores[i], mathScores[i]);
            System.out.println(names[i] + "의 등급: " + getGrade(koreanScores[i], englishScores[i], mathScores[i]));
            if (isPass(koreanScores[i], englishScores[i], mathScores[i])) {
                System.out.println("축하합니다. 합격입니다.\n");
            } else {
                System.out.println("귀하는 불합격입니다.\n");
            }
        }
    }

    // 학생 정보 출력 메서드
    public static void displayStudentInfo(String name, int koreanScore, int englishScore, int mathScore) {
        System.out.println("학생 이름: " + name);
        System.out.println("국어 점수: " + koreanScore);
        System.out.println("영어 점수: " + englishScore);
        System.out.println("수학 점수: " + mathScore);
        System.out.println("평균 점수: " + calculateAverage(koreanScore, englishScore, mathScore));
    }

    // 평균 계산 메서드
    public static double calculateAverage(int koreanScore, int englishScore, int mathScore) {
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    // 등급 반환 메서드
    public static String getGrade(int koreanScore, int englishScore, int mathScore) {
        double average = calculateAverage(koreanScore, englishScore, mathScore);
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
    public static boolean isPass(int koreanScore, int englishScore, int mathScore) {
        return calculateAverage(koreanScore, englishScore, mathScore) >= 80.0;
    }
}
