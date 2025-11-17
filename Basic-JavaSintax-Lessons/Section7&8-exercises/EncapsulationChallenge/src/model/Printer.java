package model;

public class Printer {
    private int tonerLevel; //percentage of torner left in the torner cartridge
    private int pagesPrinted;
    private final boolean duplex; //will it print in both sides? true means it can, false means it can only print
                            // in one side


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel + tonerAmount > 100 || tonerLevel + tonerAmount < 0){
            return -1;
        }else {
            tonerLevel += tonerAmount;
            System.out.println("Added toner successfully");
            return tonerLevel;
        }
    }

    public int printPages(int pagesToBePrinted){
        int sheetsOfPaper = 0;
        if (pagesToBePrinted < 0){
            return -1;
        }

        if (duplex){
            System.out.println("This is a duplex printer! So one sheet of paper can be filled with 2 pages.");
            sheetsOfPaper += pagesToBePrinted % 2 == 0 ? pagesToBePrinted / 2 :
                    (pagesToBePrinted / 2) + 1;
        }else{
            sheetsOfPaper += pagesToBePrinted;
        }

        pagesPrinted += sheetsOfPaper;
        return sheetsOfPaper;
    }
}
