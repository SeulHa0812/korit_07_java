package java_exam2;
/*
문제 19: 나눗셈 예외 처리 (try-catch)
설명: 두 정수를 나누는 과정에서 발생할 수 있는 ArithmeticException (0으로 나누기)을 try-catch 블록을 사용하여 처리하는 프로그램을 작성하세요.

요구사항 명세서:

divide 메서드는 두 정수 a, b를 인자로 받아 나눗셈 결과를 출력합니다.
main 메서드에서 try-catch 블록을 사용합니다.
try 블록 안에서 10을 0으로 나누는 divide 메서드를 호출합니다.
catch 블록에서 ArithmeticException을 잡아 "0으로 나눌 수 없습니다." 라는 메시지를 출력합니다.
finally 블록을 사용하여 예외 발생 여부와 상관없이 "계산을 종료합니다." 메시지를 출력합니다.

실행 예:
0으로 나눌 수 없습니다.
계산을 종료합니다.
 */
public class DivisionCalculator {
    public static void divide(int a, int b) {
        System.out.println("나눗셈 결과: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            DivisionCalculator.divide(10,0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("계산을 종료합니다.");
        }

    }
}