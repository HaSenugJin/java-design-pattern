package ex10;

import ex10.alarm.Alarm;
import ex10.command.AlarmCommand;
import ex10.command.Command;
import ex10.command.LampCommand;
import ex10.lamp.BlueLamp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 사용자 입력 받기
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        // 입력에 따른 버튼 생성 (팩토리)
        ButtonFactory factory = ButtonFactory.getInstance();
        Button button = factory.createButton(command);

        // 커맨드 패턴이 적용된 메서드
        button.press();
    }
}