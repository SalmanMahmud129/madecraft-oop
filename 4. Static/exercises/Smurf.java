package exercises;
import java.util.HashSet;
import java.util.Set;

public class Smurf {

	private static Set<String> nameSet = new HashSet<>();
	private String name;


	public static Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		if(nameSet.contains(name)){
			throw new IllegalArgumentException(name + " was already created!");
		}
		nameSet.add(name);
		return new Smurf(name);
	}

	private Smurf(String name) {
		
		this.name = name;
		
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
