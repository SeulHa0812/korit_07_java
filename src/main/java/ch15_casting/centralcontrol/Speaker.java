package ch15_casting.centralcontrol;

public class Speaker implements Power {
    @Override
    public void on() {
        System.out.println("스피커의 전원을 킵니다");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끕니다");
    }
}
