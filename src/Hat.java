import javax.swing.JOptionPane;

public class Hat {
private String color;
private boolean tophat;
private boolean bowler;
private boolean baseball;
Hat(String color, boolean tophat, boolean bowler, boolean baseball){
	this.color=color;
	this.tophat=tophat;
	this.bowler=bowler;
	this.baseball=baseball;
}
public String getColor(){
	return this.color;
}
public void setColor(String color) {
	this.color=color;
if(color.equals("blue")) {
	JOptionPane.showMessageDialog(null, "Blue is bad");
	
}else {
	this.color=color;
}
}}
