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

    final int COLUMN_1 = a - 400;
    final int COLUMN_2 = a - 270;
    final int COLUMN_3 = a - 133;
    final int COLUMN_4 = a - 0;

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

    protected JTextField addTextField() {
        JTextField textField = new JTextField();
        textField.setSize(getElementSize());
        textField.setBackground(Color.orange);
        return textField;
    }

    protected JLabel addLabel(String name) {
        JLabel label = new JLabel(name);
        label.setSize(getElementSize());
        return label;
    }

    protected JButton addButton(String name) {
        JButton button = new JButton(name);
        button.setSize(getElementSize());
        return button;
    }
}

