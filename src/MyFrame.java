import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    String name;
    final int a = 420, b = 600;
    final int STRING_1 = b - 600;
    final int STRING_2 = b - 550;
    final int STRING_3 = b - 500;
    final int STRING_4 = b - 450;
    final int STRING_5 = b - 400;
    final int STRING_6 = b - 350;
    final int STRING_7 = b - 300;
    final int STRING_LAST = b - 140;

    final int COLUMN_1 = a - 400;
    final int COLUMN_2 = a - 270;
    final int COLUMN_3 = a - 133;
    final int COLUMN_4 = a - 0;

    MyFrame(String name) {
        this.name = name;
        setName(this.name);
        setTitle(this.name);
        setSize(a, b);
        setLocation(a+100, b-400);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    protected Dimension getElementSize() {
        int width = 120;
        int height = STRING_2;
        return new Dimension(width, height);
    }

    protected Dimension getElementSize1() {
        int width = 60;
        int height = STRING_2;
        return new Dimension(width, height);
    }

    protected Dimension getButtonSize() {
        int width = a;
        int height = STRING_3;
        return new Dimension(width, height);
    }

    protected JTextField addTextField() {
        JTextField textField = new JTextField();
        textField.setSize(getElementSize());
        textField.setBackground(Color.orange);
        textField.setText("0");
        textField.setFont(new Font("", Font.BOLD, 25));
        return textField;
    }

    protected JLabel addLabel(String name) {
        JLabel label = new JLabel(name);
        label.setSize(getElementSize());
        return label;
    }

    protected JButton addButton(String name) {
        JButton button = new JButton(name);
        button.setSize(getButtonSize());
        return button;
    }
}

