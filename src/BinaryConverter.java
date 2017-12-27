import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton("Convert!");
	JTextField bine = new JTextField(50);
	JTextField conversion = new JTextField(50);


	public static void main(String[] args) {
		BinaryConverter hi = new BinaryConverter();
		hi.makeui();
	}

	public void makeui() {
		frame.add(panel);
		panel.add(bine);
		panel.add(convert);
		panel.add(conversion);
		frame.setVisible(true);
		frame.pack();
		convert.addActionListener(this);
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convertToString(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource() == convert) {
		String bin = bine.getText();
		//bin = convertToString(bin);
		int fin = convert(bin);
		conversion.setText("" + fin);
	}
	}

}
