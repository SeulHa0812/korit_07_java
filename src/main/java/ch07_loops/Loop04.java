package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
    (전의 과제 while 대신 for more convinient)

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
        //1부터 100까지 출력하는 for문
//        for(int i = 1 ; i < 101 ; i++) {
//            System.out.println(i);
//        }
        // 1부터 100까지의 합을 구하고 한 번만 출력
//        int sum = 0;
//        for(int i = 1 ; i < 101 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        //1 부터 100까지 중 홀수 합
//        // for if 중첩적 사용
//        // 증감값 건들여서 다른 방식으로 풀 수 있음
//        //1
//        int sum2 = 0;
//        for(int i = 1 ; i < 101 ; i++) {
//            if(i % 2 == 1) {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//        //2
//        int sum3 = 0;
//        for (int i = 1 ; i < 101 ; i+=2) {
//            sum3 += i;
//        }
//        System.out.println(sum3);


        /*
        숫자를 입력받아서 1부터 n까지 더하는 반복문 작성
        예
        1부터 몇 까지 더하시겠습니까? >>> 10

        1부터 10까지의 합은 55입니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1 ; i < (num+1) ; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
//
//        // 강사님 풀어
////        int sum5 = ((num*(num+1))/2);
////        System.out.println("1부터 " + num + "까지의 합은 " + sum5 + "입니다.");
    }
}
