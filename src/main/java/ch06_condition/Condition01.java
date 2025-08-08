package ch06_condition;

import java.util.Scanner;

/* 조건문
1. if문 :  if 다음에 있는 () 내의 조건식이 true 일때 {} 내의 실행문 실행

형식 :
    if(조건식) {  조건식 : true / false로 결론이 날 수 있는 식 또는 문장
    실행문
   }

 */
public class Condition01 {
    public static void main(String[] args) {
        int num1 = 10;
        //조건문 적용예시
        if (num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if (num1 < 15) {
            System.out.println("num1은 15 초과입니다.");
        }

        //scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>>");
        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println("num2는 양수입니다.");
        }
        System.out.println("프로그램 종료");
    }
}
