import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
JFrame frame = new JFrame();
JLabel letter = new JLabel();
char currentletter;
	
public static void main(String[] args) {
	TypingTutor tut = new TypingTutor();
	tut.speck();
	tut.currentletter = tut.generateRandomLetter();
}
public void speck(){
	frame.add(letter);
	frame.setSize(250, 250);
	frame.setVisible(true);
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}

}