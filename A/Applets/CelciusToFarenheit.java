import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 * <applet code="FourthApplet" width="300" height="300"></applet>
 */
public class FourthApplet extends Applet implements ActionListener{
    Label lbl;
    TextField txt;
    TextArea output;
    Button btn;

    public void init(){
        setLayout(new FlowLayout());

        lbl=new Label("Enter Celcius:");
        txt=new TextField(10);
        btn=new Button("Tempreture in Fehrenheit is:");
        output=new TextArea(12,20);
        output.setEditable(false);

        add(lbl);
        add(txt);
        add(btn);
        add(output);

        btn.addActionListener(this);


    }
     public void actionPerformed(ActionEvent e){
        output.setText("");
        try{
            int num=Integer.parseInt(txt.getText());
            output.append(9/5* num + 32+"\n");
            }
        
        catch (NumberFormatException ex){
            output.setText("Please enter a valid interger.");
        }
    }
}