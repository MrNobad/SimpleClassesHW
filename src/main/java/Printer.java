public class Printer {


    public int paper;
    public int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public void print(int copies, int pages) {
        int total = copies * pages;
        if (this.paper >= total  && this.toner >= total)
        {
        this.paper -= total;
        this.toner -= total;
        }
    }
}
