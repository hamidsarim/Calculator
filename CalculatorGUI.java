import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField textfield;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] operatorButtons = new JButton[9];
    private JButton addButton, minusButton, divButton, mulButton;
    private JButton decButton, equButton, delButton, clrButton, negateButton;
    private JPanel panel;
    private CalculatorLogic logic;

    public CalculatorGUI() {
        logic = new CalculatorLogic(this);
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground( Color.BLACK);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(new Font("Consolas", Font.BOLD, 23));
        textfield.setForeground(Color.WHITE);
        textfield.setOpaque(false);
        textfield.setEditable(false);

        

        addButton = new JButton("+");
        minusButton = new JButton("-");
        divButton = new JButton("/");
        mulButton = new JButton("*");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clear");
        negateButton = new JButton("+/-");

        operatorButtons[0] = addButton;
        operatorButtons[1] = minusButton;
        operatorButtons[2] = divButton;
        operatorButtons[3] = mulButton;
        operatorButtons[4] = decButton;
        operatorButtons[5] = equButton;
        operatorButtons[6] = delButton;
        operatorButtons[7] = clrButton;
        operatorButtons[8] = negateButton;

        //for operator buttons
        for (int i = 0; i < 9; i++) {
            operatorButtons[i].addActionListener(logic);
            operatorButtons[i].setFont(new Font("Consolas", Font.BOLD, 23));
            operatorButtons[i].setFocusable(false);
            operatorButtons[i].setForeground(Color.WHITE);
            operatorButtons[i].setFocusPainted(false);
            operatorButtons[i].setContentAreaFilled(false);
        }

        //for number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(logic);
            numberButtons[i].setFont(new Font("Consolas", Font.BOLD, 23));
            numberButtons[i].setForeground(Color.WHITE);
            numberButtons[i].setFocusPainted(false);
            numberButtons[i].setContentAreaFilled(false);
            numberButtons[i].setFocusable(false);
        }

        negateButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setOpaque( false );

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(minusButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negateButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public JTextField getTextField() {
        return textfield;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDecButton() {
        return decButton;
    }

    public JButton getEquButton() {
        return equButton;
    }

    public JButton getDelButton() {
        return delButton;
    }

    public JButton getClrButton() {
        return clrButton;
    }

    public JButton getNegateButton() {
        return negateButton;
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }
}
