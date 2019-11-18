import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000, 1000);
    }

    @Test
    public void hasPaper(){
        assertEquals(1000, printer.paper);
    }

    @Test
    public void canPrint(){
        printer.print(3, 5);
        assertEquals(985, printer.paper);
    }

    @Test
    public void cantPrintWithoutPaper(){
        printer.print(1, 990);
        printer.print(3, 5);
        assertEquals(10, printer.paper);
    }

    @Test
    public void hasToner(){
        printer.print(1, 990);
        assertEquals(10, printer.toner);
    }

}
