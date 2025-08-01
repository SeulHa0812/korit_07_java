package ch06_condition;

import java.util.Scanner;

/*
if - else if - else 문
형식 :
if(조건식1) {
실행문1
} else if(조건식2) {
실행문2
} else if(조건식3) {
실행문3
} else {
실행문 4
}

 */
public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("포인트를 입력하세요 >>>");
        int point = scanner.nextInt();
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
        else {
            userGrade = "GENERAL";
        }
        System.out.println("회원 등급 : " + userGrade);
    }
    /* if - else의 경우 if 내의 조건식이 false 라면 바로 else 의 실행문이 실행되는 데 반해,
    if - else if - else 의 경우 else 위의 조건식들을 차례대로 검토한 후에, 그 무엇도 해당되지 않으면 else 실행문 실행

    개발자의 신경써야하는 점?
    조건식의 순서를 설정하는 부분
     */
}
