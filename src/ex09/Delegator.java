package ex09;

public class Delegator {
    private Printer printer;

    public Delegator(Printer printer) {
        this.printer = printer;
    }

    public void printMessage(String message) {
        printer.print(message);
    }
}
