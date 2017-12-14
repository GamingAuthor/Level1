
public class Fox {
	String furColor;
	int age;
	String species;
	int MC;
	boolean ispilot;
Fox(String furColor, int age, String species, int MC, boolean ispilot){
	this.furColor = furColor;
	this.age = age;
	this.species = species;
	if(this.MC == 1) {
		this.ispilot = true;
	}
}
public void flew(int distance) {
	System.out.println("The fox flew "+distance+" parsecs");
}
public static void main(String[] args) {
	Fox McCloud = new Fox("yellow", 20, "Cornerian", 1, true);
	McCloud.flew(12);
}
}
