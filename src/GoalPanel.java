import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoalPanel extends MyFrame {

    JButton calculate, testHTML;
    JTextField actualCosts, estimatedCosts, rate;
    JTextField actualCostsRes, estimatedCostsRes, rateRes;
    JLabel actualCostsLabel, estimatedCostLabel, rateValueLabel;

    GoalPanel(String name) {
        super(name);


        addTextFields();
        addLabels();
        addButtons();
        addListeners();

        setVisible(true);
    }

    private void addTextFields() {
        rate = addTextField();
        rate.setLocation(COLUMN_1, STRING_1);
        add(rate);

        actualCosts = addTextField();
        actualCosts.setLocation(COLUMN_1, STRING_2);
        add(actualCosts);

        estimatedCosts = addTextField();
        estimatedCosts.setLocation(COLUMN_1, STRING_3);
        add(estimatedCosts);

        rateRes = addTextField();
        rateRes.setLocation(COLUMN_3, STRING_1);
        rateRes.setSize(getElementSize1());
        add(rateRes);

        actualCostsRes = addTextField();
        actualCostsRes.setLocation(COLUMN_3, STRING_2);
        add(actualCostsRes);

        estimatedCostsRes = addTextField();
        estimatedCostsRes.setLocation(COLUMN_3, STRING_3);
        add(estimatedCostsRes);

        testHTML = addButton("<html><H1><a href='yanex.ru'> data </a></H1></html>");
        testHTML.setLocation(COLUMN_1, STRING_6);
        testHTML.setSize(200,200);
        add(testHTML);


    }

    private void addLabels() {
        rateValueLabel = addLabel("RUB for USD ===>");
        rateValueLabel.setLocation(COLUMN_2, STRING_1);
        add(rateValueLabel);


        actualCostsLabel = addLabel("Actual Costs ===>");
        actualCostsLabel.setLocation(COLUMN_2, STRING_2);
        add(actualCostsLabel);

        estimatedCostLabel = addLabel("Estim Costs ===>");
        estimatedCostLabel.setLocation(COLUMN_2, STRING_3);
        add(estimatedCostLabel);
    }

    private void addButtons() {
        calculate = addButton("Calculate");
        calculate.setLocation(0, STRING_LAST);
        add(calculate);
    }

    private void addListeners() {
        rate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rateRes.setText(rate.getText());
            }
        });
        estimatedCosts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estimatedCostsRes.setText(estimatedCosts.getText());

            }
        });
        actualCosts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualCostsRes.setText(actualCosts.getText());
            }
        });
    }
}
