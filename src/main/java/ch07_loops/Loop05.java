package ch07_loops;

import java.util.Scanner;

/*
    중첩 for 문 가능
    for (int i = 0 ; i < 100 ; i++) {
        반복실행문1-a
        for(int j = 0 ; j < 100 , j++) {
        반복실행문2
        }
        반복실행문1-b
    }
    for문 활용하여 1일차 1교시 ~ 5일차 3교시까지 출력
 */
public class Loop05 {
    public static void main(String[] args) {
//        for(int day = 1 ; day < 6 ; day++) {
//            for (int lesson = 1; lesson < 4 ; lesson++) {
//                System.out.println(day + "일차 " + lesson + "교시 입니다.");
//            }
//        }
//
//        for(int j = 2 ; j < 10 ; j++) {
//            for (int k = 1; k < 4 ; k++) {
//                System.out.println(j + " x " + k + " = " + (j*k));

        /*
            1 2 3  ... 10
            11 ...20
         */

        // 1)
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        // 2)
        for (int j = 1; j < 101; j += 10) {
            System.out.println(j + " " + (j + 1) + " " + (j + 2) + " " + (j + 3) + " " + (j + 4) + " " + (j + 5) + " " + (j + 6) + " " + (j + 7) + " " + (j + 8) + " " + (j + 9));
        }


        /*
            숫자를 입력 받아서 n까지 더하는 반복문 for
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇 까지 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int k = 1; k < (n + 1); k++) {
            sum += k;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        // 1부터 10까지의 숫자 중 짝의 합
        int sumEven = 0;
        for (int l = 1; l < 11; l++) {
            if (l % 2 == 0) {
                sumEven += l;
            }

//        for(int m = 1 ; m < 11 ; m+=2) {
//            sumOdd += m;
//        }
            // or
//        for(int m = 1 ; m < 11 ; m++) {
//            if(m % 2 ==1) {
//                sumOdd += m;
//            }
//        }
            System.out.println(sumEven);
        }
    }
}
