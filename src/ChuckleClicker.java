import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ChuckleClicker implements ActionListener {
	JFrame popup = new JFrame();
	JPanel stuff = new JPanel();
	JButton joke = new JButton("Joke!");
	JButton punchline = new JButton("Punchline!");
public static void main(String[] args) {
	ChuckleClicker hi = new ChuckleClicker();
	hi.makeButtons();
}
public void makeButtons() {
		popup.add(stuff);
		stuff.add(joke);
		stuff.add(punchline);
		popup.setVisible(true);
		popup.pack();
		joke.addActionListener(this);
		punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonpressed = (JButton) arg0.getSource();
	if(buttonpressed == joke) {
		JOptionPane.showMessageDialog(null, "What does a nut say when it sneezes?");
	}else if(buttonpressed == punchline){
		JOptionPane.showMessageDialog(null, "Cashew!");
}
}
}

