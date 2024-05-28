package ex06.notification;

public class SmsNotifier implements Notifier {

    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SmsNotifier() {}

    // 재정의
    public void send() {
        if (notifier != null) notifier.send();
        System.out.println("문자 알림");
    }
}