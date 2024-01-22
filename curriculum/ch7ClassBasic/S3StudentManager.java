package curriculum.ch7ClassBasic;
// S1StudentManager 클래스 정의
public class S3StudentManager {

    // 메인 메서드 (테스트용)
    public static void main(String[] args) {
        // 학생 배열 생성

        // 각 학생 정보 설정
        // 2명의 개발자가 공동작업을 하고 있다고 가정해보자
        // 학생관련 자료구조와 학생 성적관리 기능을 제공하는 개발자 A
        // 개발자A가 개발한 자료구조와 메소드를 이용하여 학생 성적분석을 수행하는 개발자 B
        // 개발자B 입장에서 개발하는 학생 데이터를 생성하는 코드가 훨씬 간결해 진 것을 확인할 수 있다.
        S3Student student = new S3Student("홍길동", 90, 85, 95);

        // 개발자A가 추가로 개발한 메소드를 활용하여 개발자B 아래 분석기능을 수행합니다.
        // 개발자C도 개발자A가 제공하는 클래스를 사용하여 동일한 분석기능 개발이 가능합니다.
        // 개발자 B,C는 Studnet Class의 메뉴얼만 숙지하면 됩니다.
        student.displayStudentInfo();
        System.out.println(student.name + "의 등급: " + student.getGrade());
        if(student.isPass()){
            System.out.println("축하합니다. 합격입니다.");
        }else{
            System.out.println("귀하는 불합격입니다.");
        }
    }
}
