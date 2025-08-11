package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        // 참조자료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에
        // 사용하지 않을 것임
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

        // centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을 집어넣음
        CentralControl centralControl = new CentralControl(
                new Power[10]
        );

        centralControl.addDevice(computer1); // 여기서 (암시적) 업캐스팅이 이루어짐 18&20 비교 computer -> power
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);
        centralControl.addDevice(printer1);

        centralControl.powerOn();
        centralControl.powerOff();

        centralControl.showInfo();

        centralControl.performSpecificMethod();

//        System.out.println("-----continue-----");
//        for ( int i = 0 ; i < 10 ; i++ ) {
//            System.out.println(i+1);
//        }
//
//        for (int i = 0 ; i < 10 ; i++) {
//            if((i+1) % 2 != 1) {
//                System.out.println(i);
//            }
//        }
//
//        for (int i = 0 ; i < 10 ; i++) {
//            if((i+1) % 2 != 1) {
//                continue;
//            }
//            System.out.println(i);
//        }

    }
}
