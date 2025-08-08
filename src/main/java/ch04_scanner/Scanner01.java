package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
//         String name;
//         name = "안근수";
//        System.out.println(name);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.nextLine();
        /*
        1. println print 차이
            ln : line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨.
            print로 작성할 경우에 동일 라인에 그대로 연결됨.
        2. nextLine / nextInt / 등등 구분해야함
         */
//        System.out.println("연도를 입력하세요. >>> ");
//        int year = scanner.nextInt();
//        System.out.println("이름을 다시 입력하세요 >>> ");
//        name = scanner.next(); // 입력을 ahn geunsu
//        System.out.println(name);

        /* 2. next(Int / Double ...etc) vs nextLine
        - nextLine은 띄어쓰기 허용 (enter키. 즉 개행을 기준) -> 그래서 24번 라인 실행 결과가 ahn
        - 나머지는 허용안함 (띄어쓰기 하면 잘려서 대입)

         */
//        System.out.print("올해는 몇 년도인가요? >>> ");
//        int year = scanner.nextInt();
//        System.out.println("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);

        /* 이상의 코드에서의 문제점은 데이터 입력 받지 않고 그대로 넘어감
            왜 ? nextInt()에서 값을 입력하고 저희가 엔터를 치게 되는데, 그 경우 다음 nextLine()에서는 엔터키를 받아들여서 빈값은 상태로 엔터를 쳣다고 인지하게 됌
            해결 방법 : 엔터키를 받아주는 nextLine() 하나 더 만들어줌
         */

//        System.out.print("올해는 몇 년도인가요? >>> ");
//        int year = scanner.nextInt();
//        scanner.nextLine(); // 배리어 역할, 사용 않을거기 때문 변수에 대입 않았음.
//        System.out.print("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);
        // 드래그 하고 컨트롤 슬래시 하면 주석처리

        /*
        1. 코드 작성
        나이를 입력하세요 >>> 19
        저는 올해 19살입니다.
        내년에는 20살이 됩니다.

        2. 코드 작성
        점수를 입력하세요 >>>
        이름을 입력하세요 >>> 김일
        김일 학생의 점수는 4.5입니다.
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해 " + age + " 입니다.");
//        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");

        System.out.print("점수를 입력하세요 >>> ");
        double score = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");

        //배리어 없이 사용
        System.out.print("점수를 입력하세요 >>> ");
        double score1 = scanner.nextDouble();
        System.out.print("이름을 입력하세요 >>> ");
        String name1 = scanner.next();
        System.out.println(name1 + " 학생의 점수는 " + score1 + "입니다.");





    }
}
