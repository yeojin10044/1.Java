package curriculum.ch3Control;
// Cyclomatic Complexity(순환 복잡도): 지나친 중첩된 if의 과사용으로 얼마나 로직의 복잡도가 있는지 측정하는 매트릭
public class S4CyclomaticComplexity1 {

    public static void maic(String[] args) {
        // 합격 Case
//        int math = 90;
//        int eng = 95;

//        // 불합격 Case1
//              int math = 50;
//              int eng = 55;

        // 불합격 Case2
        int math = 70;
        int eng = 50;
        // 합격기준: 영어 그리고 수학 60점 이상
        if (math >= 60) {
            if (eng >= 60) { // 중첩된 (Nested) if
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        }else{
                System.out.println("불합격");
            }
        }

    }

