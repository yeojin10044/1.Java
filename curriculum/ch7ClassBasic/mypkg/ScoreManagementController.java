package curriculum.ch7ClassBasic.mypkg;

public class ScoreManagementController {
    public static void main(String[] args) {
      scoreManagement studentInfo =
              new scoreManagement("김여진",100,90,95);
        System.out.println("ScoreManagementController.main");

        //soutm
        int result = studentInfo.averageScore();

        //soutv
        System.out.println("result = " + result);

        String level = studentInfo.provideLevel();
        System.out.println("level = " + level);

    }
}
