/* Your mission and you have to accept it:
 *         Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;

	Microwave() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTimeInMinutes;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime*10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}
