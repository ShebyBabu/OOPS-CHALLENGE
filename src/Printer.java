public class Printer {


    private int tonerLevel, numberOfPages;
    private int printerType;

    public Printer(int tonerLevel, int numberOfPages, int printerType) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.printerType = printerType;
    }

    public void fillToner() {
        int extraToner = 20;
        tonerLevel = tonerLevel + extraToner;
        if (tonerLevel < 100) {
            System.out.println("Current toner level is " + tonerLevel);
        } else
            System.out.println("Toner level is 100");
    }

    public void printPageSimulation() {

      if(printerType==1) {
          numberOfPages++;

          System.out.println(numberOfPages);
      }
    }

    public void selectPrinterType() {
        if (printerType == 2) {
            System.out.println("Duplex");
            ;
        } else if (printerType == 1) {
            System.out.println("Single side");
        } else {
            System.out.println("Invalid");
        }
    }
}

    class Printing  {
        public static void main(String[] args) {
            Printer p=new Printer(50,100,2);
            p.fillToner();
            p.printPageSimulation();
            p.selectPrinterType();
        }
    }
