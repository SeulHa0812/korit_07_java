package ch06_condition;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 if - else if : if - else 문과 달리  else if 에는 별도의 조건식이 요구됨/
                그리고 else if는 여러개 나올 수 있음

     형식:
     if(조건식1) {
     실행문1
     } else if(조건식2) {
     실행문2
     } else if(조건식3) {
     실행문3
     }
 */
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = 0;
        // 상수 개념 -> 바로 초기화 필수
        final int VIP_POINT = 80; // final keyword = 재대입 불가능
        final int GOLD_POINT = 60; // 변함없는 데이터 표기 = snake case (띄어쓰기 '_')
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        System.out.println("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if (point > 80) {
            System.out.println("회원 등급 : VIP");
        } else if (point > 60) {
            System.out.println("회원 등급 : GOLD");
        } else if (point > 40) {
            System.out.println("회원 등급 : SILVER");
        } else if (point > 20) {
            System.out.println("회원 등급 : BRONZE");
        }

        //기능은 동일 개발자 친화적(유지보수 용이) 재작성 refactoring
        //1. sout 너무 많음
            String userGrade = "";
        if (point > 80) {
            userGrade = "VIP"  ;
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        }
        System.out.println("회원 등급 : " + userGrade);

        //2. 요구 등급에 대한 포인트 규정이 바뀔 경우에 조건문에서 일일 수정해야함 -> 위의 fianl 값 바꾸기
        String userGrade2 = "";
        if (point > VIP_POINT) {
            userGrade2 = "VIP"  ;
        } else if (point > GOLD_POINT) {
            userGrade2 = "GOLD";
        } else if (point > SILVER_POINT) {
           userGrade2 = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade2 = "BRONZE";
        }
            System.out.println("회원 등급 : " + userGrade2);
    }
}
