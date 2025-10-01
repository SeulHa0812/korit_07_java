package java_exam2;
/*
문제 11: 장바구니 상품 관리 (ArrayList)
설명: ArrayList를 사용하여 장바구니에 상품을 추가, 삭제, 조회하는 간단한 프로그램을 작성하세요.

요구사항 명세서:

main 메서드에서 String 타입의 요소를 저장하는 ArrayList인 cart를 생성합니다.
cart에 "사과", "우유", "빵"을 순서대로 추가합니다.
"우유"를 cart에서 삭제합니다.
cart의 첫 번째 상품을 조회하여 출력합니다.
최종적으로 cart에 담긴 모든 상품 목록을 "실행 예"와 같이 출력하세요.

실행 예:
첫 번째 상품: 사과
최종 목록: [사과, 빵]
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();

        cart.add("사과");
        cart.add("우유");
        cart.add("빵");

        cart.remove("우유");

        System.out.println("첫 번째 상품 : " + cart.get(0));
        System.out.println("최종 목록 : " + cart);
    }
}
