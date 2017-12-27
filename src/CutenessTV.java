import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{		
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton("Ducks!");
	JButton frogs = new JButton("Frogs!");
	JButton unicorns = new JButton("Unicorns!");
	public static void main(String[] args) {
		CutenessTV hi = new CutenessTV();
		hi.makeButtons();
	}
	public void makeButtons() {
		frame.add(panel);
		panel.add(ducks);
		panel.add(frogs);
		panel.add(unicorns);
		frame.setVisible(true);
		frame.pack();
		ducks.addActionListener(this);
		frogs.addActionListener(this);
		unicorns.addActionListener(this);
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}

}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == ducks) {
			showDucks();
		}else if(arg0.getSource() == frogs) {
			showFrog();
		}else if(arg0.getSource() == unicorns) {
			showFluffyUnicorns();
		}
	}
}