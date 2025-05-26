import java.applet.Applet;
import java.awt.Graphics;
public class FirstApplet extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello, World!", 20, 20);
    g.drawOval(25, 25, 25, 25);
  }
}

/*
<applet code="FirstApplet" width=300 height=100>
</applet>
*/