
public class SeaCreatures2 {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Patrick = new SeaCreature("Patrick");
		System.out.println(Patrick.getName());
		Patrick.eat();
		Patrick.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		System.out.println(Squidward.getName());
		Squidward.eat();
		Squidward.laugh();
	}
}
