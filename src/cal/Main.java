package cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {

    Main() {

        init();
    }

    private  int intNumber= 0;
    private  double doubleNumber = 0;
    private  String operator;
    private  Number result;

    private void init() {

        this.setSize(new Dimension(350, 400));
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        BorderLayout bl = new BorderLayout();
        p1.setLayout(bl);

        GridLayout gl = new GridLayout(6, 4, 2, 2);
        p2.setLayout(gl);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(40, 73));
        textField.setFont(new Font("Arial", Font.BOLD, 35));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setText("0");
        textField.setCaretPosition(textField.getText().length());
        textField.setBorder(null);

        p1.add(textField);

        JButton b1 = new JButton("%");
        JButton b2 = new JButton("CE");
        JButton b3 = new JButton("C");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                textField.setText("0");
                operator = null;
            }
        });
        JButton b4 = new JButton("<");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                if (textField.getText().length() == 0) {
                    textField.setText("0");
                    textField.setEditable(false);
                }
            }
        });
        JButton b5 = new JButton("1/x");
        JButton b6 = new JButton("x^2");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String text = textField.getText();
                if (text.contains(".")) {
                    double number = Double.parseDouble(text);
                    double result = number * number;
                    textField.setText(String.valueOf(result));
                } else {
                    int number = Integer.parseInt(text);
                    int result = number * number;
                    textField.setText(String.valueOf(result));
                }
            }
        });
        JButton b7 = new JButton("sqrt");
        JButton b8 = new JButton("/");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                operator = "/";
                if (textField.getText().contains(".")) {
                    doubleNumber = Double.parseDouble(textField.getText());
                }else{
                    intNumber = Integer.parseInt(textField.getText());
                }
                textField.setText("");
            }
        });
        JButton b9 = new JButton("7");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("7");

                } else {
                    textField.setText(textField.getText() + "7");
                }

            }
        });
        JButton b10 = new JButton("8");
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("8");
                } else {
                    textField.setText(textField.getText() + "8");
                }
            }
        });
        JButton b11 = new JButton("9");
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("9");
                } else {
                    textField.setText(textField.getText() + "9");
                }
            }
        });
        JButton b12 = new JButton("x");
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                operator = "x";
                if (textField.getText().contains(".")) {
                    doubleNumber = Double.parseDouble(textField.getText());
                }else{
                    intNumber = Integer.parseInt(textField.getText());
                }
                textField.setText("");
            }
        });
        JButton b13 = new JButton("4");
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("4");
                } else {
                    textField.setText(textField.getText() + "4");
                }
            }
        });
        JButton b14 = new JButton("5");
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("5");
                } else {
                    textField.setText(textField.getText() + "5");
                }
            }
        });
        JButton b15 = new JButton("6");
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("6");
                } else {
                    textField.setText(textField.getText() + "6");
                }
            }
        });
        JButton b16 = new JButton("-");
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                operator = "-";
                if (textField.getText().contains(".")) {
                    doubleNumber = Double.parseDouble(textField.getText());
                }else{
                    intNumber = Integer.parseInt(textField.getText());
                }
                textField.setText("");
            }
        });
        JButton b17 = new JButton("1");
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("1");
                } else {
                    textField.setText(textField.getText() + "1");
                }
            }
        });
        JButton b18 = new JButton("2");
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("2");
                } else {
                    textField.setText(textField.getText() + "2");
                }
            }
        });
        JButton b19 = new JButton("3");
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().equals("0")) {
                    textField.setText("3");
                } else {
                    textField.setText(textField.getText() + "3");
                }
            }
        });
        JButton b20 = new JButton("+");
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                operator = "+";
                if (textField.getText().contains(".")) {
                    doubleNumber = Double.parseDouble(textField.getText());
                }else{
                    intNumber = Integer.parseInt(textField.getText());
                }
                textField.setText("");
            }
        });
        JButton b21 = new JButton("+/-");
        JButton b22 = new JButton("0");
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textField.getText().length() >= 1 && !textField.getText().equals("0")) {
                    textField.setText((textField.getText() + "0"));
                }
            }
        });
        JButton b23 = new JButton(".");
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String text = textField.getText();
                if (text.length() >= 1 && !text.contains(".")) {
                    textField.setText(text + ".");
                }

            }
        });
        JButton b24 = new JButton("=");
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (operator != null) {
                    // int 
                    if (intNumber != 0) {
                        if (textField.getText().contains(".")){
                            // int & double
                            doubleNumber = Double.parseDouble(textField.getText());
                            if (operator.equals("/")) {
                                result = intNumber / doubleNumber;
                                String []data = result.toString().split("\\.");
                                if ("0".equals(data[1])) {
                                    textField.setText(String.valueOf(data[0]));
                                }else{
                                    textField.setText(String.valueOf(result));
                                }
                                
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("x")) {
                                result = intNumber * doubleNumber;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("-")) {
                                result = intNumber - doubleNumber;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("+")) {
                                result = intNumber + doubleNumber;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }
                        }else{
                            // int & int
                            int secondInt = Integer.parseInt(textField.getText());
                            if (operator.equals("/")) {
                                result = intNumber / secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if(operator.equals("x")){
                                result = intNumber * secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("-")) {
                                result = intNumber - secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("+")) {
                                result = intNumber + secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }
                        }
                    }else{
                        // double
                        if (textField.getText().contains(".")){
                            // double & double
                            Double secondDouble = Double.parseDouble(textField.getText());
                            if (operator.equals("/")) {
                                result = doubleNumber / secondDouble;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("x")) {
                                result = doubleNumber * secondDouble;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                                
                            }else if (operator.equals("-")) {
                                result = doubleNumber - secondDouble;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("+")) {
                                result = doubleNumber + secondDouble;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }
                        }else{
                            // double & int
                            int secondInt = Integer.parseInt(textField.getText());
                            if (operator.equals("/")) {
                                result = doubleNumber / secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if(operator.equals("x")){
                                result = doubleNumber * secondInt;
                                textField.setText(String.valueOf(result));
                                String []data = result.toString().split("\\.");
                                if ("0".equals(data[1])) {
                                    textField.setText(String.valueOf(data[0]));
                                }else{
                                    textField.setText(String.valueOf(result));
                                }
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("-")) {
                                result = doubleNumber - secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }else if (operator.equals("+")) {
                                result = doubleNumber + secondInt;
                                textField.setText(String.valueOf(result));
                                operator = null;
                                doubleNumber = 0;
                                intNumber = 0;
                            }
                        }
                    }
                }
            }
        });
        b24.setBackground(new Color(71, 177, 234));

        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24};
        for (JButton button : buttons) {
            p2.add(button);
        }

        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.NORTH);
        this.add(p2);

    }

    public static void main(String[] args) {

        new Main().setVisible(true);

    }
}



