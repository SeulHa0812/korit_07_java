package java_exam2;
/*
문제 5: 상품 재고 관리 (사용자 정의 예외)
설명: 상품 재고를 관리하는 프로그램에서 재고가 부족할 때 사용자 정의 예외 OutOfStockException을 발생시키고 처리하는 코드를 작성하세요.

요구사항 명세서:

Exception 클래스를 상속받는 OutOfStockException 사용자 정의 예외 클래스를 만듭니다.
Product 클래스에 decreaseStock 메서드를 구현합니다. 이 메서드는 요청 수량(quantity)이 현재 재고(stock)보다 많으면 OutOfStockException을 발생시킵니다.
재고가 충분하면 stock에서 quantity만큼 차감합니다.
main 메서드에서 try-catch 블록을 사용하여 decreaseStock 메서드를 호출하고, OutOfStockException이 발생했을 때 적절한 메시지를 "실행 예"와 같이 출력하세요.

재고 부족: 15개 주문 불가. 현재 재고: 10개.
 */
//class OutOfStockException extends Exception {
//    public OutOfStockException(String message) {
//        super(message);
//    }
//}

//class Product {
//    private String name;
//    private int stock;
//
//    public Product(String name, int stock) {
//        this.name = name;
//        this.stock = stock;
//    }
//
//    public void decreaseStock(int quantity) throws OutOfStockException {
//        if (quantity > stock) {
//            throw new OutOfStockException("재고 부족: " + quantity + "개 주문 불가. 현재 재고: " + stock + "개.");
//        } else {
//            stock -= quantity;
//        }
//    }
//
//    public int getStock() {
//        return stock;
//    }
//}

public class InventoryManager {
//    public static void main(String[] args) {
//        Product laptop = new Product("노트북", 10);
//        int orderQuantity = 15;
//
//        try {
//            laptop.decreaseStock(orderQuantity);
//        } catch (OutOfStockException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
