package ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배열에 이름 입력할수있게

    2. scores 배열에 점수 입력할 수 있게
 */
public class Array02 {
    public static void main(String[] args) {
        // 몇 명의 학생을 등록하시겠습니까? >>> 5 라고 가정
        //그럼 그 이후에 5명짜리 등록할 수 있는 빈 배열 생성되어야함
        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        //nextInt()때문에 다음 nextLine()의 엔터가 적용되어 바로 2번으로 넘어갈 가능성 -> 배리어 필요 넣은 곳 순서 중요
        human = scanner.nextInt();
        scanner.nextLine();

//        String[] humans = new String[human];
//        for (int i = 0 ; i < humans.length ; i++) {
//            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
//            humans[i] = scanner.nextLine(); //배열의 값 받는 법
//        }

        // humans라고 하는 배열의 크기와 scores라는 배열의 크기는 동리해야함
        //빈 배열의 선언 및 크기 지정을 할 때 어떤 변수를 사용할 수 있는가

//        double sum = 0;
//        double[] scores = new double[human];
//        for (int i = 0 ; i < scores.length ; i++) { // humans.length나 scores,length나 human이나 다 같음
//            System.out.print((i+1) + "번 학생의 점수를 입력하세요 >>> ");
//            scores[i] = scanner.nextDouble();
//            sum += scores[i];
//        }
//        System.out.println("학생들 점수의 총합은 " + sum + "점 입니다.");

        //실행 예만 반영
//        for (int i = 0 ; i < human ; i++) {
//            sum += scanner.nextDouble();
//        }

        String[] humans = new String[human];
        for (int i = 0 ; i < humans.length ; i++) {
            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine(); //배열의 값 받는 법
                if  (i == 1 || i == 3) { // if (i % 2 == 1)
                    System.out.println(humans[i]);
                }
        }
        // default form에서 수정이 가해지는 것보다 조건문 사용하는 것이 나음
    }
}
