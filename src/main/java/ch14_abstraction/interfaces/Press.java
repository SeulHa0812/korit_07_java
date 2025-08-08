package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않고,
        final 키워드도 적지 않지만
        public final이 생략되어있음. 그래서 String 앞에 final을 명시하더라고
        Intellij 상에서 불필요하다는 안내가 뜸

        밑에 안되는 예시들 나열
     */
//    String age; //필드(인스턴스 변수) 선언 불가능
//    public Press(){}; //생성자 불가능
//    void popOut() {
//        System.out.println("추상 메서드 x/ 얘는 일반 메서드");
//    }

    // 되는 예시
    void onPressed();
}
