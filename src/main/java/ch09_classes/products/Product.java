package ch09_classes.products;

public class Product {
    // 1. 필드(속성) 선언
    int productNum;
    String productName;

    // 2. 생성자 생성 (alt + ins)

    public Product() {
    }

    public Product(int productNum) {
        this.productNum = productNum;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    // 3. 출력되도록 showInfo() 메서드 선언
    public void showInfo() {
        System.out.println("\n시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
