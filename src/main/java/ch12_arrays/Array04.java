package ch12_arrays;

import java.util.Scanner;

/*
    main에서 사용하는 불특정 Sring[] 배열을 argument로 하는 메서드를 호출 했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main에서 사용하는 불특정 String[]배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부 element들이 값을 하나한 다 입력 받아서 바꾸는 method를 정의하는 것
 */
public class Array04 {
    // 메서드 정의 영역
    // 리턴타입 메서드이름(매개변수)
    public void printElements() {
        String[] names = {"김일", "김이", "김삼", "김사", "김오", "김육"};
        for (int i = 0 ; i < names.length ; i++) {
            System.out.print(names[i] + " ");
        }
    }
    public void printElements(String[] strArray) {
        for (int i = 0 ; i < strArray.length ; i++) {
            System.out.print(strArray[i] + " ");
        }
    }
    public void printElements(int[] strArray) {
        for (int i = 0 ; i < strArray.length ; i++) {
            System.out.print(strArray[i] + " ");
        }
    }

    // 입력 관련 method 정의
    public void writesElements(String[] strArray) {
        //스캐너 import, 매개변수로 받은 배열에 값 입력
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < strArray.length ; i++) {
            System.out.print("입력하세요 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }

    public void writesElements(double[] doubleArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < doubleArray.length ; i++) {
            System.out.print("입력하세요 >>> ");
            doubleArray[i] = scanner.nextDouble();
        }
    }
    public static void main(String[] args) {
        Array04 array04 = new Array04();
        //임이의 String[] 배열 생성
        String[] people = new String[5]; // 5개짜리 비어있는 배열

        array04.writesElements(people);
        array04.printElements(people);

        double[] scores = new double[5];
        array04.writesElements(scores);


//        // 메서드 호출 영역
//     array04.printElements();
//     System.out.println();
//     //문제점: 메서드 호출 했을 때 특정 배열의 element만 출력됨
//
//        String[] students = {"이일", "이이", "이삼", "이사", "이오"};
//        array04.printElements(students);
//        System.out.println();
//
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        array04.printElements(teachers);
//        System.out.println();
//
//        int[] dates = { 2025, 8, 5 };
//        array04.printElements(dates);

    }
}
