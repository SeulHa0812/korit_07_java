package java_exam2;

/*
문제 7: 도형 넓이 계산기 (추상 클래스)
설명: 다양한 도형의 넓이를 계산하는 프로그램을 추상 클래스를 이용하여 구현합니다. 공통 기능을 부모 추상 클래스에 정의하고, 각 도형 클래스에서 이를 상속받아 구체적인 넓이 계산 로직을 구현합니다.

요구사항 명세서:

Shape 추상 클래스를 만듭니다. 이 클래스는 calculateArea()라는 abstract 메서드를 가집니다.
Shape를 상속받는 Circle 클래스와 Rectangle 클래스를 구현합니다.
Circle은 반지름(radius) 필드를, Rectangle은 가로(width)와 세로(height) 필드를 가집니다.
각 클래스에서 calculateArea() 메서드를 오버라이딩하여 원과 사각형의 넓이를 계산하는 로직을 구현합니다. (원주율은 3.14로 계산)
main 메서드에서 Circle과 Rectangle 객체를 생성하고, 각 도형의 넓이를 "실행 예"와 같이 출력하세요.

실행 예:
원의 넓이: 314.0
사각형의 넓이: 40.0
 */

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("원의 넓이: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("사각형의 넓이: " + rectangle.calculateArea());
    }
}