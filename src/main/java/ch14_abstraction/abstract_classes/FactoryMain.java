package ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 '원래는' 못한다.
        Factory factory1 = new Factory() { // 익명 클래스
            // factory 상속 받은 메서드라 볼 수 있음. 위에 작성하지 않은 name 을 쓸 수 있기 때문
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("스마트폰 공장을 관리합니다.");

            }
        }; //세미콜론 꼭 명시해야하는데 이 전체 코드라인이 메서드를 정의하는 것이 아니라 객체를 생성한 것이기 때문
        factory1.setName("가전 제품 공장");
        factory1.showInfo();
        /*
            이상의 개념은 익명 클래스로, Java1.1 -> 현재는 람다식(Lambda Expression)으로 대체되는 경우가 많음(JavaScript 에도 동일하게 적용)

            재사용하지 않고 한 번만, 즉 이 경우에는 FactoryMain 에서만 쓰고 치울 예정이면 사용하기 좋음.

         */

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
        //부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성한대로 작동되는지 확인
        phoneFactory1.produce("아이폰17에어");
        phoneFactory1.manage();
        //이번엔 부모 클래스의 일반 메서드를 호출
        phoneFactory1.showInfo();

        /*
            오버라이딩 개념은 '재정의'를 전제로 부모 클래스와 자식 클래스의 메서드가 '다르게' 굴러갈 경우에만 이루어지면 ㄷ ㅚ고,
            부모 클래스의 메서드를 동일하게 사용할거라면 애초에 받아올 필요도 없이 그냥 쓰면 됨.

            다만 우리가 자식 클래스를 정의했을 때 부모 클래스에 특정 메서드가 있음을 명확하게
            알고 있어야할 필요가 잇음.

            부모 클래스에 showInfo()라는 메서드가 있는걸 몰랐다면 우리는
            PhoneFactory 클래스에 showInfo() 클래스를 정의했을 것.
         */
        System.out.println();
        //4.객체 생성
        TabletFactory tabletFactory1 = new TabletFactory();
        //5. 업그레이드 메서드 호출
        tabletFactory1.upgrade("아이패드 프로 13인치 8세대");
        //6. setter 이용 해서 name 수정
        tabletFactory1.setName("애플 테블릿 공장");
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println(tabletFactory1.getName() + "으로 변경되었습니다.");

        //7. produce manege 메서드는 부모클래스 Factory 에서 호출
        tabletFactory1.produce("구글 테블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 테블릿 10인치 2세대");

        System.out.println();

        //8. Factory 클래스의 인스턴스인 factory2 객체를 생성
        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + " 컴퓨터를 생산합니다.");
                //9.produce 재정의
            }

            @Override
            public void manage() {
                System.out.println(this.getName() + "을(를) 관리합니다.");
                //10. manage 재정의
            }
        };
        //11. setter 이용 name 바꾸기
        factory2.setName("삼성 컴퓨터 공장");
        //12. showInfo 호출
        factory2.showInfo();

    }
}
