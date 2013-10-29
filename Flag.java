import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
        
    private AmericanFlag flag;

    public void init() {
        flag = new AmericanFlag(200, 200, 1.0);
    }

    public void paint(Graphics g) {
        //System.out.println("Flag painter");
        flag.draw(g);
    }

}