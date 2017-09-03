import javax.swing.*;

public class LoginForm extends MyFrame {

    JLabel label = new JLabel();

    public LoginForm(String name) {
        super(name);
        addItems();

        setVisible(true);

    }

    private void addItems() {
        label.setSize(300, 500);
        label.setLocation(0, 0);
        label.setText("12341241312");
        add(label);
    }


    public static void main(String[] args) {

        new LoginForm("Login form");

    }
}
