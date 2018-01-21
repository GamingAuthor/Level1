import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel letter = new JLabel();
char currentletter;
	
public static void main(String[] args) {
	TypingTutor tut = new TypingTutor();
	tut.currentletter = tut.generateRandomLetter();
	tut.speck();
}
public void speck() {
	frame.add(panel);	
	letter.setFont(letter.getFont().deriveFont(28.0f));
	letter.setHorizontalAlignment(letter.CENTER);
	panel.add(letter);
	panel.setPreferredSize(new Dimension(225,50));
	frame.setTitle("Java Teaches Typing!");
	letter.setText("" + currentletter);
	frame.addKeyListener(this);
	frame.pack();
	frame.setVisible(true);
	
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyChar() == currentletter) {
		System.out.println("Correct");
		panel.setBackground(Color.GREEN);
	}else {
		panel.setBackground(Color.RED);
	}
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyChar() == currentletter) {
	currentletter = generateRandomLetter();
	letter.setText("" + currentletter);
	}else {
		
	}

}

}