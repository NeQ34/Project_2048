package GUI;

import javax.swing.*;
import java.awt.*;

public class Map {
    private int value;
    private final JLabel label;

    public Map(){
        this.value=0;
        this.label=new JLabel("",SwingConstants.CENTER);
        this.label.setBackground(Color.red);
        this.label.setFont(new Font("Verdana",Font.PLAIN,30));
        this.label.setBorder(BorderFactory.createLineBorder(Color.green));
    }

    public int getValue() {
        return value;
    }
    public JLabel getLabel() {
        return label;
    }

    public void setValue(int value) {
        this.value = value;
        if(value==0) this.label.setText("");
        else this.label.setText(String.valueOf(value));
    }
}
