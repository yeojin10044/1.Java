package curriculum.ch7ClassBasic;

public class S9StudentManager {

    public static void main(String[] args) {
        // 5명의 학생 정보를 배열로 생성
        S9Student[] students = new S9Student[5];

        // 각 학생 정보 설정
        students[0] = new S9Student("홍길동", 90, 85, 95);
        students[1] = new S9Student("김철수", 88, 92, 78);
        students[2] = new S9Student("이영희", 76, 89, 91);
        students[3] = new S9Student("박지성", 95, 87, 94);
        students[4] = new S9Student("손흥민", 82, 90, 88);

        // 각 학생의 정보 출력
        for (S9Student student : students) {
            student.displayStudentInfo();
            System.out.println(student.name + "의 등급: " + student.getGrade());
            if (student.isPass()) {
                System.out.println("축하합니다. 합격입니다.\n");
            } else {
                System.out.println("귀하는 불합격입니다.\n");
            }
        }


        // 추가: 전체 학생 수 출력
        System.out.println("전체 학생 수: " + S9Student.getTotalStudents());
    }
}
