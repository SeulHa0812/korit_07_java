package ch09_classes;

import java.util.Scanner;

/*
 method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
call1() ~ call4()

형식 :
    (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
        메서드 내부에서 순차적으로 실행될 코드들 -> 이 묶음을 비지니스 로직이라고 하기도 합니다.
    }
    예시 :
        public void writeSchedule(String data. String content) {
            System.out.println(data + "일의 스케줄은 다음과 같습니다.");
            System.out.println(content);

    호출 예시 :
        객체명.writeSchedule("20250804". "메서드/오버로딩/클래스 복습");

 */
public class ReviewMethod {
    // 메서드 정의 영역
    public void writeSchedule(String data, String content) {
        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }

    public void writeSchedule(int data, String content) {
        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }

    public void dividedBySeven(int num) {
        // System.out.println("임이의 숫자를 입력하세요 >>> " + num);
        //지역 변수 선언
        // String answer = ""; -> sout 대신 answer 사용 가능
        if (num % 7 == 0) {
            System.out.println(num + "은 7의 배수입니다.");
        } else {
            System.out.println(num + "은 7의 배수가 아닙니다.");
        }
    }

    public void dividedBySeven() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("임이의 숫자를 입력하세요 >>> ");
        num = scanner.nextInt(); // 이거 메소드의 리턴값이 num이라는 변수에 저장되는 것
//
//        if (num % 7 == 0) {
//            System.out.println(num + "은 7의 배수입니다.");
//        } else {
//            System.out.println(num + "은 7의 배수가 아닙니다.");
//        }
        dividedBySeven(num); // 메서드 내부에서 다른 메서드 호출
        // or if 중복 쓰지않고 divideBySeven(num); 으로 불러올수도있음
    }

        public static void main (String[]args) {
            // 메서드 호출 영역
            ReviewMethod reviewMethod = new ReviewMethod(); // 객체
            reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
            reviewMethod.writeSchedule(20250805, "클래서/getter/setter 예습");

            reviewMethod.dividedBySeven(100);
            reviewMethod.dividedBySeven(); //argument가 없기 때문에 메서드 내에서 사용해야함
        }
    }
