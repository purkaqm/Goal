import org.jdom2.JDOMException;

import javax.swing.*;

public class LoginForm extends MyFrame {

    JButton button = new JButton();

    public LoginForm(String name) {
        super(name);


        setVisible(true);

    }

    public static void main(String[] args) {

        new LoginForm("Login form");

    }
}
