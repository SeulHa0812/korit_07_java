package ch14_abstraction.interfaces;

public class AirConditionerController {
     //필드 선언
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    //AllArgsConstructor
    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton, ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    //method 호출
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public String onUpTemperatureUpButton() {
        temperatureUpButton.onUp();
        return temperatureUpButton.onUp();
    }

    public void modeChangeButton() {
        modeChangeButton.onPressed();
    }

}
