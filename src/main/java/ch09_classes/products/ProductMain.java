package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        //4. 객체 생성
        Product product1 = new Product();
        //5. 필요한 변수 다시 선언 = 속성 값 대입
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        Product product2 = new Product(9876564);
        product2.productName = "다이소충전기";

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;

        Product product4 = new Product(951753, "GFlip6");


        //6. 콘솔에 출력되도록 메서드 불러오기
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
