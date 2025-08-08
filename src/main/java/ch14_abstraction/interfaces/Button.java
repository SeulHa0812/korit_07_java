package ch14_abstraction.interfaces;
/*
    클래스는 단일 상속만 가능 extends
    인터페이스는 다중 상속 가능 implements
    Inside a button class, two general methods and one abstract method.
    if all abstract methods, powerbutton 에서 필요없는 추상메서드까지 필수로 요구됨.
 */
public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() { //일반 메서드지만 본문에 아무것도 안써둠
    }

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}