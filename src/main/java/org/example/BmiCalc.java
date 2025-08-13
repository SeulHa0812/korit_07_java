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

    // argument & parameter
    // 정의 -> 호출
    // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 변수명 으로 이루어져
    // 있기 때문에 '선언'이라고 간주하면됨
    public void calcBmi(String name, double height, double weight) {
        //or height = height * 0.01;
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
    //call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calcBmi(Person person) {
        // Person class의 각 field들에 private을 적용했기 때문에 값을 불러오기 위해서는
        // Getter 사용해야만 함. 하지만 너무 코드가 길어지기 때문에
        // 지역 변수들을 선언하고 거기에 값을 대입하여 사용.
        String name = person.getName(); // getName 을 쓰느냐 혹은 지역변수를 선언하느냐의 차이
        double height = person.getHeight() * 0.01;
        double weight = person.getWeight();
        double bmi = weight /(height*height);
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

    public static void main(String[] args) {
     BmiCalc bmiCalc = new BmiCalc(); // 객체 생성 구지 밑에 더 할 필요 없음
     bmiCalc.calcBmi();

     bmiCalc.calcBmi("Seul", 166, 47.5);

//        System.out.println("---scanner 사용---");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name3 = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height3 = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight3 = scanner.nextDouble();
//        bmiCalc.calcBmi(name3, height3, weight3);

        System.out.println("---객체 생성 후 call3() 활용 방법----");
        // 여기에 Person 객체를 생성해야하는데, 일반적인 방식이 아니라
        //Builder 패턴을 적용한 방식으로 생성해서
        //calcBmi() 메서드의 argument로 집어넣어줘야함

        //1. Person 객체 생성
        //1-1. 원래 객체 생성 방법
        Person person4 = new Person("김사", 172, 68);
        System.out.println(person4);

        //1-2. Builder 패턴 사용 객체 생성 방법
        Person person5 = Person.builder()
                .name("Seul")
                .weight(47.5)
                .height(166)
                .build();

         bmiCalc.calcBmi(person5);

        System.out.println("--Scanner에 객체 사용 예시---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>> ");
        String name6 = scanner.nextLine();
        System.out.println("키를 입력하세요 >>> ");
        double height6 = scanner.nextDouble();
        System.out.println("몸무게를 입력하세요 >>> ");
        double weight6 = scanner.nextDouble();
        Person person6 = Person.builder()
                .name(name6)
                .weight(weight6)
                .height(height6)
                .build();

        bmiCalc.calcBmi(person6);



    }
}
