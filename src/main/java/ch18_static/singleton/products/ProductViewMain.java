package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance(); //여러번해도 1번 객체만 생성됨

        // 이상의 코드는 ProductView.java를 확인 했을 대 객체를 생성하는 method
        // 생성자를 호출하지 않은 이유는 생성자가 private 이기 때문
        // 하지만 이상의 코드를 실행 했을 때 1번째 객체가 생성되었습니다.
        /*
            한 줄 만 출력됨.
            그런데 그 전에 static 배웠을 때는 1, 2, 3, 4, 5번째 객체가 생성되었습니다로
            튀어나왔는데 차이가 뭐냐면
            생성자 내에 지역 변수로 int counter를 선언하고 초기화 했었기 때문

            그래서 static. 패키지 내부의 코드와 이번의ProductView 코드를 비교/대조해서 확인할 필요 있음

         */
    }
}
