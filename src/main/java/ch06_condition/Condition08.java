package ch06_condition;

import java.util.Scanner;

/* 윤년 계산기 작성

 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String ans = "";

        if ((year % 4 == 0) && (year % 100 != 0)) {
            ans = "윤년입니다.";
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            ans = "윤년입니다.";
        } else if ( year % 100 == 0) {
            ans = "윤년이 아닙니다.";
        }
        System.out.println( year + "년도는 " + ans );

        //
//        int leapyear = scanner.nextInt();
//        if (year % 400 == 0) {
//            leapyear = "윤년이 아닙니다.";
//        } else if (year % 4 == 0) {}
//        else {
//            leapyear = "윤년이 아닙니다.";
//        }
    }
}
