import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	int n = 0;
	int win = 0;
	Date date = new Date();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("Mole!");
	
	public static void main(String[] args) {
		
		Random numbo = new Random();
		int num = numbo.nextInt(10);
		Whackamole whack = new Whackamole();
		whack.drawButtons(num);
		

	}

	void lol() {
	}

	void drawButtons(int rand) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 10; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (rand == i) {
				panel.add(mole);
			}
		}
		frame.setTitle("Moles Whacked: 0");
		frame.add(panel);
		panel.setPreferredSize(new Dimension(250, 150));
		frame.pack();
		frame.setVisible(true);
		mole.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(mole)) {
			speak("ouch");
			frame.dispose();
			Random numbo = new Random();
			int num = numbo.nextInt(10);	
			panel.removeAll();
			mole.removeActionListener(this);
			drawButtons(num);
			win++;
			frame.setTitle("Moles Whacked: " + win);
			System.out.println(win);
			if (win==10) {
				endGame(date, 10);
			}
		} else {
			if (n == 0) {
				speak("missed me");
				frame.dispose();
				Random numbo = new Random();
				int num = numbo.nextInt(10);
				panel.removeAll();
				mole.removeActionListener(this);
				drawButtons(num);
				n++;
				frame.setTitle("Moles Whacked: " + win);
			} else if (n == 1) {
				speak("almost there");
				frame.dispose();
				Random numbo = new Random();
				int num = numbo.nextInt(10);
				panel.removeAll();
				mole.removeActionListener(this);
				drawButtons(num);
				n++;
				frame.setTitle("Moles Whacked: " + win);
			} else if (n == 2) {
				speak("you're bad");
				frame.dispose();
				Random numbo = new Random();
				int num = numbo.nextInt(10);
				panel.removeAll();
				mole.removeActionListener(this);
				drawButtons(num);
				n++;
				frame.setTitle("Moles Whacked: " + win);
			} else if (n == 3) {
				speak("terrible job");
				frame.dispose();
				Random numbo = new Random();
				int num = numbo.nextInt(10);
				panel.removeAll();
				mole.removeActionListener(this);
				drawButtons(num);
				n = 0;
				frame.setTitle("Moles Whacked: " + win);
			}
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
