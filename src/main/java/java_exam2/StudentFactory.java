package java_exam2;
/*
문제 20: 학생 정보 객체 생성 (생성자 오버로딩)
설명: 다양한 방법으로 학생(Student) 객체를 생성할 수 있도록 생성자 오버로딩을 구현하세요.

요구사항 명세서:

Student 클래스는 studentId (학번, int)와 name (이름, String) 필드를 가집니다.
세 가지 종류의 생성자를 정의합니다.
기본 생성자: studentId는 -1, name은 "미정"으로 초기화합니다.
학번만 받는 생성자: name은 "미정"으로 초기화합니다.
학번과 이름을 모두 받는 생성자
main 메서드에서 세 가지 생성자를 각각 사용하여 객체를 생성하고, 각 객체의 정보를 "실행 예"와 같이 출력하세요.\
실행 예:
학번: -1, 이름: 미정
학번: 2025001, 이름: 미정
학번: 2025002, 이름: 홍길동
 */
class Student {
    int studentId;
    String name;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("학번: " + studentId + ", 이름: " + name);
    }
}

public class StudentFactory {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "미정";
        student1.studentId = -1;
        student1.printInfo();

        Student student2 = new Student(2025001);
        student2.name = "미정";
        student2.printInfo();

        Student student3 = new Student(2025002, "홍길동");
        student3.printInfo();
    }
}
