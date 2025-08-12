package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance
    private static ProductView instance; // ProductView 클래스의 정적 필드인 instance // datatype 자기 자신

    //private 으로 생성자를 선언 (강제) -> 객체가 하나만 생성되는걸 보장하기 위한 접근지정자이므로 매우 중요
    private ProductView() {
        int counter = 1; // 이건 객체가 생성될 때 만들어지는 지역 변수
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    //static 메서드의 정의 -> 대부분의 경우 getInstance() -> 클래스명.메서드명() 호출
    public static ProductView getInstance() { //여기서 ProductView는 return type
        if(instance == null) { //현재 인스턴스가 없는 시점이라면 17번 코드라인이 true이므로
            instance = new ProductView(); //생성자 호출 -> 객체 생성 //ProductView(0 생성자를 호출하여 instance에 대입
        }
        return instance; // 이미 생성되었으면 바로 20번 라인 실행
    }
}
