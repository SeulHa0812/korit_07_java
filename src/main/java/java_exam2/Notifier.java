package java_exam2;
/*
문제 8: 알림 서비스 (인터페이스)
설명: 다양한 채널(이메일, SMS)로 알림을 보내는 서비스를 인터페이스를 사용하여 구현합니다. 각 알림 방식은 동일한 인터페이스를 구현하지만, 실제 동작은 다르게 작성됩니다.

요구사항 명세서:

send(String message) 추상 메서드를 가진 Notification 인터페이스를 정의합니다.
Notification 인터페이스를 구현하는 EmailNotification과 SmsNotification 클래스를 작성합니다.
각 클래스의 send 메서드는 "실행 예"와 같이 채널에 맞는 알림 메시지를 출력합니다.
main 메서드에서 두 클래스의 객체를 생성하고, send 메서드를 호출하여 각각 다른 메시지를 전송하는 코드를 작성하세요.

실행 예:
이메일 발송: 주문이 완료되었습니다.
SMS 발송: 배송이 시작되었습니다.
*/
interface Notification {
    abstract void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("이메일 발송: " + message);
    }
}

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS 발송: " + message);
    }
}

public class Notifier {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send("주문이 완료되었습니다.");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.send("배송이 시작되었습니다.");
    }
}
