package ch06_condition;

import java.util.Scanner;

/* 고민해봐야 할 사항은
Condition05의 코드
100초과 / 0미만의 점수가 입력됐을 떄 각각 A /F라는 결과값
애초에 잘못된 점수 입력 -> 불가능한 점수 입력이라고 안내
100 초과 / 0 미만의 경우 grade == x
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
// if int (score > 89) / = 선호하지 않음
        //if double (score >= 90)
        if(score > 89) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

//        if (score > 100 || score < 0) {
//           grade = "X"; }

        //논리 연산자를 표함한 풀이
        if (score >  100 || score < 0) {
            grade = "x";
        } else if(score > 89) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
