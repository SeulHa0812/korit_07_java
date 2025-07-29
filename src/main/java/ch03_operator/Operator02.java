package ch03_operator;
/*
논리연산자

true (1) / false (0) : 컴퓨터가 읽을 수 있는 두 숫자
boolean : true / false 를 구분하는 자료형

    AND(&&) : 곱 연산자 T x T = T / T x F = F / F x F = F 하나라도 거짓이면 거짓
    OR (||) : 합 연산자 하나라도 참이면 참
    NOT (!) : true 값을 false로, false 값을 true로 역전시키는 연산자
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);
        // || 연산자
        boolean result4 = flag1 || flag1;
        System.out.println("T X T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T x F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F x F = " + result6);


        boolean result7 = (flag1 || flag2) && flag2;

        boolean result8 = 10 % 3 == 0;
        // 나머지 연산의 결과값의 자료형은 ? int


    }
}
