import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame {

    int a;
    int b;
    int c;
    int d ;
    private JFrame frame;

    private JButton number1;
    private JButton number2;
    private JButton number3;
    private JButton number4;
    private JButton number5;
    private JButton number6;
    private JButton number7;
    private JButton number8;
    private JButton number9;
    private JButton number0;
    private JButton num;
    private JButton act1;
    private JButton act2;
    private JButton act3;
    private JButton act4;
    private JButton act5;

    private JLabel javab ;

    private JTextField unameField;
    //private JPasswordField psswdField;
    private JPanel dokmeha;
    private JPanel aemal;

    public Frame(String title) {
        //dokmeha = new JPanel();
        aemal = new JPanel(new GridLayout(4, 4));
        dokmeha = new JPanel(new GridLayout(4, 4));
        frame = new JFrame(title);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        unameField = new JTextField();
        //frame.setLayout(new GridLayout(4,4));
        javab = new JLabel();

        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(panel);

        JLabel label = new JLabel();
        //label.setBackground(Color.ORANGE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        LoginHandler loginHandler = new LoginHandler();

        JPanel fieldsPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        //fieldsPanel.add(unameLabel);
        fieldsPanel.add(unameField);
        //fieldsPanel.add(psswdLabel);
        //fieldsPanel.add(psswdField);

        number1 = new JButton("1");
        number2 = new JButton("2");
        number3 = new JButton("3");
        number4 = new JButton("4");
        number5 = new JButton("5");
        number6 = new JButton("6");
        number7 = new JButton("7");
        number8 = new JButton("8");
        number9 = new JButton("9");
        number0 = new JButton("0");

        num = new JButton();
        act1 = new JButton("-");
        act2 = new JButton("+");
        act3 = new JButton("/");
        act4 = new JButton("*");
        act5 = new JButton("=");


        number1.addActionListener(loginHandler);
        number2.addActionListener(loginHandler);
        number3.addActionListener(loginHandler);
        number4.addActionListener(loginHandler);
        number5.addActionListener(loginHandler);
        number6.addActionListener(loginHandler);
        number7.addActionListener(loginHandler);
        number8.addActionListener(loginHandler);
        number9.addActionListener(loginHandler);
        number0.addActionListener(loginHandler);


        act1.addActionListener(loginHandler);
        act2.addActionListener(loginHandler);
        act3.addActionListener(loginHandler);
        act4.addActionListener(loginHandler);
        act5.addActionListener(loginHandler);


        num.addActionListener(loginHandler);


        /*int buttonWidth = number1.getPreferredSize().width;
        int buttonHeight = number1.getPreferredSize().height + 10;*/
        //number1.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        //panel.add(label, BorderLayout.NORTH);
        panel.add(fieldsPanel, BorderLayout.NORTH);


        dokmeha.add(number1);
        dokmeha.add(number2);
        dokmeha.add(number3);
        dokmeha.add(number4);
        dokmeha.add(number5);
        dokmeha.add(number6);
        dokmeha.add(number7);
        dokmeha.add(number8);
        dokmeha.add(number9);
        //dokmeha.add(num);
        dokmeha.add(number0);

        dokmeha.add(act1);
        dokmeha.add(act2);
        dokmeha.add(act3);
        dokmeha.add(act4);
        dokmeha.add(act5);
        /*panel.add(number1, BorderLayout.CENTER);
        panel.add(number2, BorderLayout.EAST);
        panel.add(number3, BorderLayout.EAST);
        panel.add(number4, BorderLayout.SOUTH);
        panel.add(number5, BorderLayout.SOUTH);
        panel.add(number6, BorderLayout.SOUTH);
        panel.add(number7, BorderLayout.SOUTH);
        panel.add(number8, BorderLayout.SOUTH);
        panel.add(number9, BorderLayout.SOUTH);
        panel.add(number0, BorderLayout.SOUTH);*/
        panel.add(dokmeha, BorderLayout.CENTER);


        /*aemal.add(number0);
        aemal.add(number1);
        aemal.add(number2);*/

        //panel.add(aemal);

    }

    public void showGUI() {
        frame.pack();
        frame.setVisible(true);
    }

    private class LoginHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            /*if (e.getSource().equals(loginButton)) {
                System.out.println("SOURCE: Login Button");
            } else if (e.getSource().equals(unameField)) {
                System.out.println("SOURCE: User Field");
            } else if (e.getSource().equals(psswdField)) {
                System.out.println("SOURCE: Password Field");
            }*/
            if (e.getSource().equals(number0)) {
                //unameField.print();
                System.out.println("0");
                a = 0;
            }
            if (e.getSource().equals(number1)) {
                System.out.println("1");
                if (a == 0) {
                    a = 1;
                } else {
                    b = 1;
                }
                d = 1;
                unameField.setText(Integer.toString(d));
            }
            if (e.getSource().equals(number2)) {
                System.out.println("2");
                if (a == 0) {
                    a = 2;
                } else {
                    b = 2;
                }
                d= 2 ;
                unameField.setText(Integer.toString(d));
            }
            if (e.getSource().equals(number3)) {
                System.out.println("3");
                if (a == 0) {
                    a = 3;
                } else {
                    b = 3;
                }
                d= 3 ;
                unameField.setText(Integer.toString(d));
            }
            if (e.getSource().equals(number4)) {
                System.out.println("4");
            }
            if (e.getSource().equals(number5)) {
                System.out.println("5");
            }
            if (e.getSource().equals(number6)) {
                System.out.println("6");
            }
            if (e.getSource().equals(number7)) {
                System.out.println("7");
            }
            if (e.getSource().equals(number8)) {
                System.out.println("8");
            }
            if (e.getSource().equals(number9)) {
                System.out.println("9");
            }
            if (e.getSource().equals(act1)) {
                System.out.println("-");
            }
            if (e.getSource().equals(act2)) {
                System.out.println("+");

            }
            if (e.getSource().equals(act3)) {
                System.out.println("/");
            }
            if (e.getSource().equals(act4)) {
                System.out.println("*");
            }
            if (e.getSource().equals(act5)) {
                System.out.println("=");
                //JLabel.
                c = a + b;
                unameField.setText(Integer.toString(c));
            }
            //String user = unameField.getText();
            //String pwd = new String(psswdField.getPassword());
            /*if (user.equals(pwd)) {
                JOptionPane.showMessageDialog(frame, "MATCH! :)", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "MISMATCH! :(", "Result", JOptionPane.ERROR_MESSAGE);
            }*/

        }
    }
}
