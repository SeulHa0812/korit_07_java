package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton; //(접근지정자) (정의한 클래스명) (객체명) -> 여태까지의 작성방법과 다름
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    //#2 volume
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    //All 생성자

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    //볼륨 필드(객체)의 메서드 호출
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.println(volumeUpButton.onUp());
    }

//    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
//    public void onPressedPowerButton() {
//        powerButton.onPressed();
//    }
//
//    public void onPressedChannelDownButton() {
//        channelDownButton.onPressed();
//    }
//
//    public void onDownChannelDownButton() {
//        channelDownButton.onDown();
//    }
//
//    public void onPressedChannelUpButton() {
//        channelUpButton.onPressed();
//    }
//    //#1
////    public String onUpChannelUpButton() {
////        channelUpButton.onUp();
////        return channelUpButton.onUp(); //onUp();의 결과값이 return "채널을 계속 " + super.onUp();
////    }
//    //#2
//    public void onUpChannelUpButton() {
//        System.out.println(channelUpButton.onUp());
//    }

}
