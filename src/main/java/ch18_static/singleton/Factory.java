package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    // method
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        //접근 지정자 안썻으니까 default, 그리고 {} 영역 내에 있으니까 지역변수
         String model = "갤럭시S26";
         String serial;

         //얘도 지역변수지만,
         Samsung samsung = Samsung.getInstance();
         //삼성 객체를 생성-> 싱글톤 썼으니까 어차피 동일한 객체가 계속 대입됨
        serial = samsung.CreateSerialnumber(model);
        //지금 현재 리턴 타입이 SmartPhone, 그러니까 SmartPhone 객체 튀어나와야하는데,
        //스마트폰 객체 생성할 때 AllArgsConstructor 해야함

        //지역 변수
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        return  smartPhone;
    }
}
