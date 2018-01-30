import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField num = new JTextField(10);
	JTextField nom = new JTextField(10);
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JButton mul = new JButton("Multiply");
	JButton div = new JButton("Divide");
	JLabel answer = new JLabel();
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.ui();
	}
	void ui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(num);
		panel.add(nom);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		frame.add(panel2);
		panel2.add(answer);
		answer.setFont(answer.getFont().deriveFont(28.0f));
		answer.setHorizontalAlignment(answer.CENTER);
		answer.setText("21");
		panel.setPreferredSize(new Dimension(300,200));
		panel2.setPreferredSize(new Dimension(100,100));
		frame.pack();
		frame.setVisible(true);
		
	}
	void plus() {
		
	}
	void minus() {
		
	}
	void x() {
		
	}
	void slash() {
		
	}
}
