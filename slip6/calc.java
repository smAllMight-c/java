import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculate extends JFrame {
    private JLabel dno,bno,ono,hno,bnl,onl,hnl;
    private JTextField text;
    private JButton calc,clear;


    public calculate() {
        setTitle("Conversion");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        dno= new JLabel("Decimal Number");
        bno=new JLabel("Binary Number");
        ono=new JLabel("Octal Number");
        hno=new JLabel("Hexadecimal Number");
        bnl=new JLabel();
        onl=new JLabel();
        hnl=new JLabel();
        text= new JTextField();
        calc= new JButton("Calculate");
        clear= new JButton("Clear");


        setLayout(new GridLayout(5,2));
        add(dno);
        add(text);
        add(bno);
        add(bnl);
        add(ono);
        add(onl);
        add(hno);
        add(hnl);
        add(calc);
        add(clear);

        calc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num=Integer.parseInt(text.getText());
                bnl.setText(Integer.toBinaryString(num));
                onl.setText(Integer.toOctalString(num));
                hnl.setText(Integer.toHexString(num));
                
            }

        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                text.setText("");
                bnl.setText("");
                onl.setText("");
                hnl.setText("");
            }
        });

    }
}

class calc {
    public static void main(String[] args) {
        new calculate();
    }
}
