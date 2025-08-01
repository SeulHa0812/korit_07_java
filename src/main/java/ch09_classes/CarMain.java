package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        // 필드에 값 대입
        myCar.color = "빨강";
        myCar.speed = 160;

        Car yourCar =  new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        //메서드 호출
        myCar.drive();
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();
    }



}
