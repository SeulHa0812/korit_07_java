package ch13_inheritance.products;
/*
 1.super(); -> 얘는 부모 생성자를 호출한다는 의미
 2.super.메서드명(); -> 얘는 부모 클래스의 메서드를 호출한다는 의미

 처음에 public class Product extends Item { 에서
 왜 오류가 발생하는지 어떻게 검증하는지

 부모-자식의 상속관계가 성립되어 있을 때,
 부모 클래스에서 기본 생성자 없이 매개변수 생성자만 있다면
 자식 클래스에서 완벽한 기본 생성자를 만드는 것이 불가능

 자식 클래스의 객체 생성시 필수적으로 '부모 클래스의 생성자를 호출'하기 때문
 //    public Product(String name, String category) {
//        super(name, category);
//    } 생성자 선택 안 함 눌러도 이렇게 나옴

 //어떤 객체를 생성한다고 가정할 때
 A a = new B();
 같은 형태의 객체 생성 방식이 튀어나오게 되는데
 이상의 방식은 정처기 단골 문제


 */
public class Product extends Item {
    // 자식 고유의 field 정의
    private int price;
    private int stock;

    // 커서 가져다대면 파란줄 알아서 super생성해줌
    //4. 이거는 부모 생성자를 호출한건데, Product클래스의 AllArgsConstructor를 만들고 싶다면
//    public Product(String name, String category) {
//        super(name, category);
//    }
//위에꺼 대신 별개로 알트 인설트 해서 생성자 만드면됨 위에는 부모것만 충족한걸로 나옴
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }
    //5. 자식 고유의 필드는 getter setter따로 만들어야 함

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //6. 자동 완성 아닌 고유 메서드 하나 임의로 정의
    public void showInfo() {
        System.out.println("제품명 : " + this.getName()); // 부모거라서 getter로 조회
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price); //자식 거라서 field로 조회
        System.out.println("재고 : " + stock); // 코드 차이 명확히 알아야함
    }
}
