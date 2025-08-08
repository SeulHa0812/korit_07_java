package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton(); //onPressed 두번

        //굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        //생성하는 방법
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton() //객체는 있지만 객체명은 없음
//        );


//        tvRemoteController.onPressedPowerButton();
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        tvRemoteController.onPressedChannelUpButton();
//        //#1
////        System.out.println(tvRemoteController.onUpChannelUpButton());
//        //#2
//        tvRemoteController.onUpChannelUpButton();

        //볼륨 관련부분
//        TvRemoteController tvRemoteController1 = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
//                new VolumeDownButton(), new VolumeUpButton()
//        );
//        tvRemoteController1.onPressedVolumeDownButton();
//        tvRemoteController1.onDownVolumeDownButton();
//        tvRemoteController1.onPressedVolumeUpButton();
//        tvRemoteController1.onUpVolumeUpButton();
//
        //AirConditionerController
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton()
        ); //객체생성
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton());
        airConditionerController.modeChangeButton();
        airConditionerController.modeChangeButton();
        airConditionerController.onPressedPowerButton();


    }
}
