package org.example;

import java.util.Scanner;

public class BmiCalc {
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        double bmi =  weight /(height*height);
        String result = "";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "비만 전 단계";
        } else if (bmi < 25) {
            result = "1단계 비만";
        } else if (bmi < 30) {
            result =  "2단계 비만";
        } else if (bmi < 35) {
            result = "3단계 고도비만";
        } else {
            System.out.println("잘못된 입력값입니다.");
        }
        System.out.println(name + " 님의 BMI 지수는 " + bmi + "로 " + result + "입니다.");
    }


    public void calcBmi(String name, double height, double weight) {
        double bmi =  weight /((height*0.01)*(height*0.01));
        String result = "";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "비만 전 단계";
        } else if (bmi < 25) {
            result = "1단계 비만";
        } else if (bmi < 30) {
            result =  "2단계 비만";
        } else if (bmi < 35) {
            result = "3단계 고도비만";
        } else {
            System.out.println("잘못된 입력값입니다.");
        }
        System.out.println(name + " 님의 BMI 지수는 " + bmi + "로 " + result + "입니다.");

    }

//    public void calcBmi(Person person) {
//
//    }

    public static void main(String[] args) {
     BmiCalc bmiCalc1 = new BmiCalc();
     bmiCalc1.calcBmi();

     BmiCalc bmiCalc2 = new BmiCalc();
     bmiCalc2.calcBmi("Seul", 166, 47.5);




    }
}
