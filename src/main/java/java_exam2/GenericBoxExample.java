package java_exam2;
/*
문제 10: 다양한 타입의 데이터 상자 (제네릭 클래스)
설명: 어떤 타입의 데이터든 담을 수 있는 제네릭 Box 클래스를 작성하여, 문자열과 정수를 각각 담고 출력하는 프로그램을 만드세요.

요구사항 명세서:

제네릭 타입 T를 사용하는 Box<T> 클래스를 정의합니다.
Box 클래스는 T 타입의 content 필드를 가집니다.
content 필드에 대한 생성자와 Getter 메서드를 작성합니다.
main 메서드에서 String을 담는 Box와 Integer를 담는 Box 객체를 각각 생성하고, getContent() 메서드를 이용해 "실행 예"와 같이 내용물을 출력하세요.

실행 예:
문자열 상자 내용: Hello World
정수 상자 내용: 123
 */
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericBoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello World");
        System.out.println("문자열 상자 내용: " + box1.getContent());

        Box<Integer> box2 = new Box<>(123);
        System.out.println("정수 상자 내용: " + box2.getContent());
    }
}