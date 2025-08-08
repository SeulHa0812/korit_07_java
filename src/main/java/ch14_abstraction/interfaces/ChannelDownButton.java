package ch14_abstraction.interfaces;

public class ChannelDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내립니다.");
    }
    //위의 필수로 요구되는 추상 메서드, 일반 메서드는 Alt ins로 재정의 할 수 있음

    @Override
    public void onDown() {
        System.out.println("채녈을 계속 내립니다.");
    }

}

// 현재 채널 올려주는 버튼/ 내려주는 버튼/ 전원 버튼 각각 있음.
// 각각 따로 있는 버튼들을 하나로 모아주는 클래스 작성 예정
// but 문제 class 단일 상속만 가능

