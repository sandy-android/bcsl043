import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SecondApplet extends Applet implements ActionListener {
    Button circleBtn, triangleBtn;
    String shapeToDraw = "";

    public void init() {
        setLayout(new FlowLayout());
        circleBtn = new Button("Draw Circle");
        triangleBtn = new Button("Draw Triangle");
        add(circleBtn);
        add(triangleBtn);

        circleBtn.addActionListener(this);
        triangleBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleBtn) {
            shapeToDraw = "circle";
        } else if (e.getSource() == triangleBtn) {
            shapeToDraw = "triangle";
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x = 100, y = 100, size = 80;
        if ("circle".equals(shapeToDraw)) {
            g.setColor(Color.BLUE);
            g.drawOval(x, y, size, size);
        } else if ("triangle".equals(shapeToDraw)) {
            g.setColor(Color.RED);
            int[] xPoints = {x, x + size / 2, x + size};
            int[] yPoints = {y + size, y, y + size};
            g.drawPolygon(xPoints, yPoints, 3);
        }
    }
}

/*
 * <applet code="SecondApplet.class" width="600" height="600">
 * </applet>
 */