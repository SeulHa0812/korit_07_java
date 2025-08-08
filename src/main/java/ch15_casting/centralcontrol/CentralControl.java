package ch15_casting.centralcontrol;

public class CentralControl {
    //field
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }


    //method
    public void addDevice(Power device) {
        // Power의 자식 클래스에 해당하는 인스턴스들을
        //deviceArray 라는 필드에 추가하고 싶음
        //그러면 CentralControlMain 에서 객체 생성을 할 때
        // deviceArray의 최종 indexNumber는 고정되게 되는데,
        // 다 들어차있는 배열에 덮어쓰기가 일어나서도 안되고(즉 기존 element를 삭제하면 안됨)
        //비어있는 element에 device 추가를 할 수 있어야 함.
        //그렇다면 필요한 기능이 배열 내에 null 값이 존재하는지에 대한 체크가 필요하다고
        //할 수 있음
        int emptyIndex = checkEmpty(); //메소드의 결과값을 변수 emptyIndex에 대입
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return; //메서드 종료 키워드
        }
        deviceArray[emptyIndex] = device; // private으로 적용해놔서 method 경유
        //public -> main 에서 그냥 바로 위의 코드를 집어넣으면 됨
        System.out.println("장치가 연결되었습니다.");
    }

    private int checkEmpty() { //메서드인데 private 사용 Main에서 굳이
        //몇 개나 더 전자제품을 추가할 수 있는지 알 필요가 없을 것 같아서
        // deviceArray 라는 배열에서 비어있는 index를 추출해야함
        // i++ 니까 가장 발리 만나게 되는 null return
        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
            if(deviceArray[i] == null) {
                return i; //즉 내열 내부에 element가 없다면 그 주소지를 return
            }
        }
        return -1;
        /*
            자바의 인덱스 넘버에는 음수값이 없기 때문에 실패를 나타낼 때 -1을 쓰는 경우가 많음
            하지만 0과 너무 가까운 수이다보니 -100이든지, 아니면 return 값으로 나올 수 없을만한 음수값을 지정하는 경우도 있는데,
            나중에 위에 있는 addDevice() 메서드에서 if(checkEmpty() == -89234)로 쓰고 싶지 않으면 -1쓰는게 가장 보편적
         */
    }
}
