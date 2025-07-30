package ch06_condition;

import java.util.Scanner;

/*
 중첩 if문(Nested - if)
    if문 내에 if 문이 중첩적으로 사용될 수 있습니다.
    형식 :
    if(조건식1) {
        실행문1
        if(조건식1a) {
            실행문1a
            } else if(조건식1b) {
                실행문1b
            } else {
                실행문1c
            }
       } else if(조건식2) {
            실행문2
            if(조건식2a) {
                실행문2a
            } else if(조건식2b) {
                실행문2b
            } else {
                실행문2c
            }
       } else {
            실행문 3
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        //중첩 활용한 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
            System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");

    }
}
