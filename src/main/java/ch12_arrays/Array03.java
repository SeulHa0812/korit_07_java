package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int num = 0;
        num = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[num];
        double[] score = new double[num];
        double sum = 0;

        for ( int i = 0 ; i < name.length ; i++) {
            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
            name[i] = scanner.nextLine();
            System.out.print(name[i] + " 학생의 점수를 등록하세요 >>> ");
            score[i] = scanner.nextDouble();
            scanner.nextLine();

            sum += score[i];
        }
        // 각 배열의 요소를 출력하는 반복문 작성 필요
        for ( int i = 0 ; i < name.length ; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();

        for ( int i = 0 ; i < score.length ; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();
        System.out.println("학생들 점수의 총합은 " + sum + "점입니다.");
    }
}
