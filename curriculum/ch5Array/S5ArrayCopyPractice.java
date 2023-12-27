package curriculum.ch5Array;

public class S5ArrayCopyPractice {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
        int[] arrInt2 = new int[5];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt2[i] = arrInt[i];
        }

        // 배열 값 출력
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.println(arrInt2[i]);
        }



    int[] arrIntSrc1 = {1, 2, 3};
    int[] arrIntDest = new int[5];
   // System은 java.lang 패키지에서 제공하는 클레스
   // 자동으로 제공하여 사용할수 있는 클래스
        // arrIntSrc(복사할배열이름, 복사할 곳의 위치, 붙여넣을배열이름, 붙여넣을 배열위치, 복사할 사이즈)


            System.out.println("End");
        }
}
