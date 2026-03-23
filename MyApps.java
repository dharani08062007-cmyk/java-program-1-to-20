import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApps extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    MyApps() {   // ✅ Constructor name fixed

        setTitle("My App");

        JLabel title = new JLabel("ARITHMETIC OPERATION");
        title.setBounds(120,20,200,30);

        JLabel l1 = new JLabel("Enter No");
        l1.setBounds(50,70,100,30);

        JLabel l2 = new JLabel("Enter No");
        l2.setBounds(50,110,100,30);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(50,150,100,30);

        t1 = new JTextField();
        t1.setBounds(150,70,120,30);

        t2 = new JTextField();
        t2.setBounds(150,110,120,30);

        t3 = new JTextField();
        t3.setBounds(150,150,120,30);
        t3.setEditable(false);

        add = new JButton("ADD");
        add.setBounds(40,210,70,30);

        sub = new JButton("SUB");
        sub.setBounds(120,210,70,30);

        mul = new JButton("MUL");
        mul.setBounds(200,210,70,30);

        div = new JButton("DIV");
        div.setBounds(280,210,70,30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add(title);
        add(l1); 
        add(l2); 
        add(l3);
        add(t1); 
        add(t2); 
        add(t3);
        add(add); 
        add(sub); 
        add(mul); 
        add(div);

        setLayout(null);
        setSize(400,320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double result = 0;

        if(e.getSource()==add)
            result = a + b;

        if(e.getSource()==sub)
            result = a - b;

        if(e.getSource()==mul)
            result = a * b;

        if(e.getSource()==div)
            result = a / b;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new MyApps();  // ✅ fixed
    }
}