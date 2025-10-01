package java_exam2;
/*
문제 14: 계산기 (메서드 오버로딩)
설명: 다양한 숫자 타입(정수, 실수)의 덧셈을 수행할 수 있도록 메서드 오버로딩을 이용하여 add 메서드를 구현하세요.

요구사항 명세서:

Calculator 클래스 안에 이름이 add인 메서드를 두 개 정의합니다.
첫 번째 add 메서드는 두 개의 int를 인자로 받아 합을 반환합니다.
두 번째 add 메서드는 두 개의 double을 인자로 받아 합을 반환합니다.
main 메서드에서 두 add 메서드를 각각 호출하여 결과를 "실행 예"와 같이 출력하세요.

실행 예:
정수 덧셈 결과: 15
실수 덧셈 결과: 6.0
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("정수 덧셈 결과: " + calc.add(5, 10));
        System.out.println("실수 덧셈 결과: " + calc.add(3.5, 2.5));
    }
}
