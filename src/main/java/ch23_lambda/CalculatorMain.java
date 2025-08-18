package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }
    public static void main(String[] args) {
        //정의한 interface Calculator 사용
        //근데 인터페이스 내부에는 두 개의 매개변수만 정의되어있음
        //여기서 추가 조작을 통해서 사칙 연산을 시도할것

         Calculator add = (x, y) -> x + y; // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 calculate()
         Calculator sub = (x, y) -> x - y; // Calculator 인터페이스의 객체명이 sub고, 내부 메서드는 calculate()
         Calculator mul = (x, y) -> x * y;
         Calculator div = (x, y) -> x / y;

        System.out.println(add.calculate(2, 3)); //  14번 라인의 주서을 참고 했을 때의 올바른 메서드 호출 방식
        //근데 너무 길어서 저희는 static method 정의함
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2, 3, add)); // static method 의 로직을 보시면,
        // 세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받음
        // 그리고 return 문을 보시면 해당 객체의 .calculate() 메서드를 호출하는 것을 확인할 수 있음
        // 근데 .add.calculate()는 return이 x + y 니까, 결과값이 5가 나옴
        // 22번 코드라인의 해석을 위해서 Calculator 인터페이스와, CalculatorMain의 static method와, 그리고 main 에서의 lambda 식을 전부
        //왔다갔다하면서 볼 필요가 있다는 의미가 됨.
        System.out.println("2 * 3 = " + operate(2, 3, mul));

    }
}
