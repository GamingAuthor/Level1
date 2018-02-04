import javax.swing.JOptionPane;

public class HatRunner {

	public static void main(String[] args) {
		Hat kevin = new Hat("red",true,false,false);
		System.out.println(kevin.getColor());
		kevin.setColor("blue");
		
	}
}
