package curriculum.ch7ClassBasic;

public class S2StudnetManager {
    // 각 학생 정보 설정
    // 2명의 개발자가 공동작업을 하고 있다고 가정해보자
    // 학생관련 자료구조와 학생 성적관리 기능을 제공하는 개발자 A
    // 개발자A가 개발한 자료구조와 메소드를 이용하여 학생 성적분석을 수행하는 개발자 B
    // 개발자B 입장에서 개발하는 학생 데이터를 생성하는 코드가 훨씬 간결해 진 것을 확인할 수 있다.
    // [클래스명] [객체명(Instance)] = new [클래스명](인자1, ... 인자n);
    // new [생성자 메소드]
    public static void main(String[] args) {
//  Ctrl+Space: 클래스의 변수명 자동 완성
//  Ctrl+Shift+Space: 객체 생성 코드 자동 완성
        S2Student student = new S2Student("홍길동",90,85,95);
        System.out.println(student.name+"의 평균 점수: "+student.calculateAverage());
    }


}
