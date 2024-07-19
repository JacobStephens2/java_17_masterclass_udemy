package net.jacobstephens.oop.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }

        outputTonerLevel();
    }

    public int addToner(int toner) {
        System.out.println("Attempting to add " + toner + " units of toner.");
        int tonerLimit = 100;
        if (toner + tonerLevel > tonerLimit) {
            System.out.println("Adding this much toner would cause the printer to overflow (go above " + tonerLimit + " units of toner), so no toner is being added.");
            outputTonerLevel();
            return -1;
        } else {
            tonerLevel += toner;
            outputTonerLevel();
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int sheets = 0;
        if (duplex) {
            System.out.println("This is a duplex printer.");
            if (pages % 2 == 1) {
                sheets = pages / 2 + 1;
            } else {
                sheets = pages / 2;
            }
        } else {
            sheets = pages;
        }
        System.out.println("Printing " + sheets + " sheets.");
        pagesPrinted += sheets;
        tonerLevel -= sheets;
        outputTonerLevel();
        return sheets;
    }

    private void outputTonerLevel() {
        System.out.println("The toner level is " + tonerLevel);
    }
}
