package ch08_methods;

import java.util.Scanner;

public class Method01 {
    /*
    여기에 메서드 정의할 예정
return 값 없다 void
     */
    //매서드 정의 영역
    // 1. [ x | x ] [ 입력값(매개변수) / 출력값(리턴값) ]
    public static void call1() {
        System.out.println("[ x | x ]");
//        System.out.println("똑같은 말 수정 버전");

    }

    // 2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("영어 인사 : " + example);
    }

    // 3. [ x | o ]
    public static String call3() {
        String example = "안녕하세요";
        System.out.println("[ x | o ]");
        return example;
    }

    public static int call3And1() {
        int example = 1;
        System.out.println("[ x | o ]");
        return 1;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리입니다.");
        return score * 3;
    }

    /*
     return이 있는 이유는 기본적으로 데이터의 조작을 위해서
     그리고 특정 메서드의 결과값이 다른 메서드의 argument로 사용될 수도 있음

     함수형 프로그래밍(Functional Programming) :"
     메서드1의 return값이 메서드2의 argument가 되고, 메서드2의 return값이 메서드 3의 argument가 되는 방식으로,

     첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩 방식

     간단 예시
     */
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n내년에는 " + (age+1) + " 입니다.";
    }

    public static void main(String[] args) {
        //매서드 호출 영역
        call1();
        call2("hell0");
        call3();
        call3And1();

        // return value를 출력하기 위해서는
        System.out.println(call3()+ "!");
        String name = "김일";
//        System.out.println(call3And1()+1); //return 쓰는 이유는 추가적인 연산하기 위해서 (실행단계에서 값 조작)
        System.out.println(name + " 학생의 학점은 " + call4(4.5) + "점입니다.");

        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.print("이름을 입력하세요 >>> ");
        myName = scanner.nextLine(); // 사실 이 .nextLine();이 메서드 > 메서드의 결과값을 myName이라는 변수에 저장
        System.out.print("나이를 입력하세요 >>> ");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge));

    }
}
