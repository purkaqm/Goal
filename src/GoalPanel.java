import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoalPanel extends MyFrame {

    JButton calculate;
    JTextField salaryUsd, baselineUsd, rateUsd, goalUsd, salaryRub, baselineRub, rateRub, goalRub, months;
    JTextField actualCostsRes, estimatedCostsRes, rateRes;
    JLabel salaryLabel, baselineLabel, rateLabel, goalLabel, usd, rub, monthsLabel;


    GoalPanel(String name) {
        super(name);


        addTextFields();
        addLabels();
        addButtons();
        addListeners();

        setVisible(true);
    }

    private void addTextFields() {
        rateUsd = addTextField();
        rateUsd.setLocation(COLUMN_2, STRING_2);
        rateUsd.setEditable(false);
        rateUsd.setBackground(Color.CYAN);
        rateUsd.setText("1");
        add(rateUsd);

        salaryUsd = addTextField();
        salaryUsd.setLocation(COLUMN_2, STRING_3);
        salaryUsd.setBackground(Color.cyan);
        salaryUsd.setEditable(false);
        salaryUsd.setText("2500");
        add(salaryUsd);

        baselineUsd = addTextField();
        baselineUsd.setLocation(COLUMN_2, STRING_4);
        add(baselineUsd);

        goalUsd = addTextField();
        goalUsd.setLocation(COLUMN_2, STRING_5);
        goalUsd.setEditable(false);
        goalUsd.setBackground(Color.cyan);
        add(goalUsd);

        months = addTextField();
        months.setLocation(COLUMN_2, STRING_6);
        months.setEditable(false);
        months.setBackground(Color.cyan);
        add(months);

        // #################################

        rateRub = addTextField();
        rateRub.setLocation(COLUMN_3, STRING_2);
        rateRub.setText("60");
        add(rateRub);

        salaryRub = addTextField();
        salaryRub.setLocation(COLUMN_3, STRING_3);
        salaryRub.setBackground(Color.cyan);
        salaryRub.setEditable(false);
        salaryRub.setText(convert(salaryUsd.getText()));
        add(salaryRub);

        baselineRub = addTextField();
        baselineRub.setLocation(COLUMN_3, STRING_4);
        baselineRub.setEditable(false);
        baselineRub.setBackground(Color.cyan);

        add(baselineRub);

        goalRub = addTextField();
        goalRub.setLocation(COLUMN_3, STRING_5);
        add(goalRub);

    }

    private void addLabels() {
        rateLabel = addLabel("Rate: ");
        rateLabel.setLocation(COLUMN_1, STRING_2);
        add(rateLabel);


        salaryLabel = addLabel("Salary: ");
        salaryLabel.setLocation(COLUMN_1, STRING_3);
        add(salaryLabel);

        baselineLabel = addLabel("Baseline");
        baselineLabel.setLocation(COLUMN_1, STRING_4);
        add(baselineLabel);

        goalLabel = addLabel("Goal");
        goalLabel.setLocation(COLUMN_1, STRING_5);
        add(goalLabel);

        usd = addLabel("    USD");
        usd.setLocation(COLUMN_2, STRING_1);
        add(usd);

        rub = addLabel("    RUB");
        rub.setLocation(COLUMN_3, STRING_1);
        add(rub);

        monthsLabel = addLabel("Months left");
        monthsLabel.setLocation(COLUMN_1, STRING_6);
        add(monthsLabel);
    }

    private void addButtons() {
        calculate = addButton("Calculate");
        calculate.setLocation(0, STRING_LAST);
        add(calculate);
    }

    private void addListeners() {


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salaryRub.setText(convert(salaryUsd.getText()));
                baselineRub.setText(convert(baselineUsd.getText()));
                goalUsd.setText(convertBack(goalRub.getText()));
                months.setText(convertMonths());

            }
        });
    }

    private String convert(String value) {
        String number = "0";
        try {
            int rate = Integer.parseInt(rateRub.getText());
            number = Integer.toString(rate * Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return "0";
        }

        return number;
    }

    private String convertBack(String value) {
        String number = "0";
        try {
            int rate = Integer.parseInt(rateRub.getText());
            if (rate != 0)
                number = Integer.toString(Integer.parseInt(value) / rate);
        } catch (NumberFormatException e) {
            return number;
        }
        return number;
    }

    private String convertMonths() {
        String number = "0";
        try {
            int goalUSD = Integer.parseInt(goalUsd.getText());
            int salary = Integer.parseInt(salaryUsd.getText());
            int baseline = Integer.parseInt(baselineUsd.getText());
            number = Integer.toString((goalUSD - baseline) / salary);
        } catch (NumberFormatException e) {
            return number;
        }
        return number;
    }


}
