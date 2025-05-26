import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="HelloApplet" width=300 height=100>
</applet>
*/
public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 30);
    }
}