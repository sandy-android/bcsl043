import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="SimpleInterest.class" width="300" height="200"></applet>
*/
public class SimpleInterest extends Applet implements ActionListener {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button calc;

    public void init() {
        l1 = new Label("Principal:");
        l2 = new Label("Rate of Interest:");
        l3 = new Label("Time (years):");
        l4 = new Label("Simple Interest:");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t4 = new TextField(10);
        t4.setEditable(false);

        calc = new Button("Calculate");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(calc);

        calc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());
            double si = (p * r * t) / 100.0;
            t4.setText(String.format("%.2f", si));
        } catch (NumberFormatException ex) {
            t4.setText("Invalid input");
        }
    }
}