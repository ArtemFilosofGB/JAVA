package OOP.Homework07Calculator.frame;

import javax.swing.*;

public class MainFrame {
    static JFrame frame;
    static JTextField result;

    public static void main(String[] args) {
        frame = new JFrame("Calc");
        frame.setSize(720,1080);

        result = new JTextField(16);
        result.setEditable(false);
        result.setText("hello");
        frame.add(result);
        frame.setVisible(true);

    }
}
