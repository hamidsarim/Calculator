import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorLogic implements ActionListener {
    private CalculatorGUI gui;
    private double num1 = 0, num2 = 0, output = 0;
    private char operator;

    public CalculatorLogic(CalculatorGUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == gui.getNumberButtons()[i]) {
                gui.getTextField().setText(gui.getTextField().getText() + i);
            }
        }
        if (e.getSource() == gui.getDecButton()) {
            gui.getTextField().setText(gui.getTextField().getText() + ".");
        }
        if (e.getSource() == gui.getAddButton()) {
            num1 = Double.parseDouble(gui.getTextField().getText());
            operator = '+';
            gui.getTextField().setText("");
        }
        if (e.getSource() == gui.getMinusButton()) {
            num1 = Double.parseDouble(gui.getTextField().getText());
            operator = '-';
            gui.getTextField().setText("");
        }
        if (e.getSource() == gui.getMulButton()) {
            num1 = Double.parseDouble(gui.getTextField().getText());
            operator = '*';
            gui.getTextField().setText("");
        }
        if (e.getSource() == gui.getDivButton()) {
            num1 = Double.parseDouble(gui.getTextField().getText());
            operator = '/';
            gui.getTextField().setText("");
        }
        if (e.getSource() == gui.getEquButton()) {
            num2 = Double.parseDouble(gui.getTextField().getText());

            switch (operator) {
                case '+':
                    output = num1 + num2;
                    break;
                case '-':
                    output = num1 - num2;
                    break;
                case '*':
                    output = num1 * num2;
                    break;
                case '/':
                    output = num1 / num2;
                    break;
            }
            gui.getTextField().setText(String.valueOf(output));
            num1 = output;
        }
        if (e.getSource() == gui.getClrButton()) {
            gui.getTextField().setText("");
        }
        if (e.getSource() == gui.getDelButton()) {
            String string = gui.getTextField().getText();
            gui.getTextField().setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                gui.getTextField().setText(gui.getTextField().getText() + string.charAt(i));
            }
        }
        if (e.getSource() == gui.getNegateButton()) {
            double temp = Double.parseDouble(gui.getTextField().getText());
            temp *= -1;
            gui.getTextField().setText(String.valueOf(temp));
        }
    }
}
