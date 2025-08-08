package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        // 그러고 우리는 객체의 메서드(기능)을 호출함
        scanner.nextLine(); //괄호안에 무언가가 있는지 체크
        //ClassA에 선언된 변수들에 값을 대입
        // 객체명.속성명 = 데이터;
        classA1.num = 0; //선언한 곳과 초기화된 곳 분리함
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + " 학생의 학번은 " + classA1.num + "번 이고, 점수는"
                            + classA1.score + "점입니다.");
        //메서드 호출 방법
        //객체명.메서드명();
        classA1.callName(); // scanner.next(); 와 같은 방식
    }
}
