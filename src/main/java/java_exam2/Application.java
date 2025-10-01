package java_exam2;
/*
문제 4: 설정 관리자 (Singleton 패턴)
설명: 애플리케이션 전체에서 단 하나의 인스턴스만 존재해야 하는 설정 관리자 클래스를 싱글톤(Singleton) 패턴을 사용하여 구현합니다.

요구사항 명세서:

SettingsManager 클래스는 private static인 자기 자신 타입의 instance 필드를 가집니다.
생성자는 private으로 선언하여 외부에서 직접 객체를 생성할 수 없도록 합니다.
getInstance() public static 메서드를 제공하여, instance가 null일 경우에만 새로운 객체를 생성하고, 항상 동일한 인스턴스를 반환하도록 합니다.
main 메서드에서 getInstance()를 두 번 호출하여 얻은 두 객체가 동일한 객체인지 == 연산자로 확인하여 "실행 예"와 같이 출력하세요.
 */
class SettingsManager {
    private static SettingsManager instance;

    private SettingsManager() {}

    public static SettingsManager getInstance() {
        if(instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }
}

public class Application {
    public static void main(String[] args) {
        SettingsManager settingsManager1 = SettingsManager.getInstance();
        SettingsManager settingsManager2 = SettingsManager.getInstance();

        if (settingsManager1 == settingsManager2) {
            System.out.println("두 인스턴스는 동일합니다.");
        } else {
            System.out.println("두 인스턴스는 다릅니다.");
        }
    }
}
