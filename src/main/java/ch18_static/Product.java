package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    //field
    private String name;
    //field level 에서 추가적으로 설정한 애너테이션
    @Getter
    private static int count = 0; //정적 필드 -> 변하는 값을 모든 인스턴스들이 공유함

    // Lombok 사용하지 않은 static 메서드 정의
    private static String title = "제품입니다.";

    public static String getTitle() {
        return title;
    }

    // 인스턴스 변수 수준의 field 정의
    private int instanceCount = 0; // 필드인데 초기화도 함'
    // 일반 필드 -> 객체 생성되면 0이라는 값 할당, 객체에 종속되어있음

    public Product() { //기본 생성자
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        instanceCount++;
        count++;
    }
}
