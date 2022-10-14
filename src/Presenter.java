import java.util.ArrayList;
import java.util.logging.*;

public class Presenter {
   View v;
   Model m;
   Logger logger;
   FileHandler fh;
   SimpleFormatter sFormat;

    Presenter(View v) throws Exception {
        this.v = v;
        logger = Logger.getLogger("CalcLog");
        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
    }

    void getOperand() {
        System.out.println(v.viewMenu());
        switch (v.getOperand()) {
            case "+":
                this.m = new SumModel();  
            break;
            case "-":
            this.m = new SumModel();
            break;
            case "/":
                this.m = new DivisionModel();
            break;
            case "*":
                this.m = new MultModel();
            break;
        }
    }

    void clickButton() {
        Complex a = v.getValue();
        Complex b = v.getValue();
        m.setA(a);
        m.setB(b);
        Complex result = m.result();
        System.out.println(v.print("Результат ",result));
        this.logger.log(Level.INFO, v.print("", result));
    }
}
