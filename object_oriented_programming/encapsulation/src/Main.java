public class Main {
    public static void main(String[] args) {

        Printer duplexPrinter = new Printer(true, 50);
        if (duplexPrinter.addToner(100) < 0) {
            duplexPrinter.addToner(50);
        }
        duplexPrinter.printPages(7);

        System.out.println();

        Printer singleSidedPrinter = new Printer(false, 40);
        if (singleSidedPrinter.addToner(50) < 0) {
            singleSidedPrinter.addToner(10);
        }
        singleSidedPrinter.printPages(7);
    }
}
