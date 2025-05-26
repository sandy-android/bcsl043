import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ThirdApplet" width="300" height="300"></applet>
*/

public class ThirdApplet extends Applet implements ActionListener {
    Label lbl;
    TextField txt;
    TextArea output;
    Button btn;

    public void init() {
        setLayout(new FlowLayout());

        lbl = new Label("Enter a number:");
        txt = new TextField(10);
        btn = new Button("Show Table");
        output = new TextArea(12, 20);
        output.setEditable(false);

        add(lbl);
        add(txt);
        add(btn);
        add(output);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        output.setText("");
        try {
            int num = Integer.parseInt(txt.getText());
            for (int i = 1; i <= 10; i++) {
                output.append(num + " x " + i + " = " + (num * i) + "\n");
            }
        } catch (NumberFormatException ex) {
            output.setText("Please enter a valid integer.");
        }
    }
}