package curriculum.ch7ClassBasic;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle =
                new Rectangle(4,5);

        System.out.println("가로4, 세로 5인 직사각형");
        System.out.println("면적: "+ rectangle.getArea());
        System.out.println("둘레: "+ rectangle.getPerimeter());
        System.out.println("정사각형 여부: "+ rectangle.isSquare());


        System.out.println("\n사용자로 입력으로 부터 사각형 분석");
        Scanner scanner =new Scanner(System.in);
        System.out.print("가로");
        double width = scanner.nextInt();
        System.out.print("세로");
        double height = scanner.nextInt();


        Rectangle rectangle2 = new Rectangle(width,height);
        System.out.println("가로" + width + ", 세로" + height + "인 직사각형");
        System.out.println("면적" + rectangle2.getArea());
        System.out.println("둘레" + rectangle2.getPerimeter());
        System.out.println("정사각형 여부" + rectangle2.isSquare());




    }
}
