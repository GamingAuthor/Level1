import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField field = new JTextField(20);
JButton message = new JButton("SEND!");
static final String FAKE_USERNAME = "brotherwickersham@gmail.com";
static final String FAKE_PASSWORD = "blamefool";
public static void main(String[] args) {
	Spamalot hi = new Spamalot();
	hi.ui();
}
public void ui() {
	frame.add(panel);
	panel.add(field);
	panel.add(message);
	frame.pack();
	frame.setVisible(true);
	message.addActionListener(this);
}
private boolean sendSpam(String recipient, String subject, String content) {
	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");
	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});
	try {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;
	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==message) {
		String dear = field.getText();
		boolean lol = sendSpam("christofuna03@gmail.com", "Spam", dear);
		System.out.println(lol);
		if(lol==true) {
			field.setBackground(Color.GREEN);
		}else {
			field.setBackground(Color.RED);
		}
	}
}

}
