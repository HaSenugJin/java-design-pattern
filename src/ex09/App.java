package ex09;

public class App {
    public static void main(String[] args) {
        Printer printer = new FilePrinter();
        Printer stringPrinter = new StringPrinter();
        Delegator delegator = new Delegator(printer);
        Delegator string = new Delegator(stringPrinter);

        delegator.printMessage("안녕하세요1");
        string.printMessage("안녕하세요2");
    }
}
