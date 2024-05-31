package ex10;

import ex10.alarm.Alarm;
import ex10.command.AlarmCommand;
import ex10.command.Command;
import ex10.command.LampCommand;
import ex10.lamp.BlueLamp;
import ex10.lamp.RedLamp;

public class ButtonFactory {
    private static ButtonFactory instance = new ButtonFactory();

    private ButtonFactory() {
    }

    public static ButtonFactory getInstance() {
        return instance;
    }

    public Button createButton(String command) { // blueLamp, redLamp, alarm
        if (command.equals("blueLamp")) {
            return new Button(new LampCommand(new BlueLamp()));
        } else if (command.equals("redLamp")) {
            return new Button(new LampCommand(new RedLamp()));
        } else if (command.equals("alarm")) {
            return new Button(new AlarmCommand(new Alarm()));
        } else {
            return null;
        }
    }
}