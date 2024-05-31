package ex10;

import ex10.command.Command;

// 인보크 역활
// 버튼은 알람이 있어야지만 작동한다.
// 버튼만 보고 요청해야 한다.
public class Button {
    private Command command;

    public Button(Command command) {
        setButton(command);
    }

    public void setButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}