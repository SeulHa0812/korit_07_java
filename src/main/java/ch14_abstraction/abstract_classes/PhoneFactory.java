package ch14_abstraction.abstract_classes;

public class PhoneFactory extends Factory{
//빨간줄 해결하기 위해 아래의 메서드 구현
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
