package examples;


public class Pond {

	public static void main(String[] args) {

		Duck mobyDuck = new Duck("Moby", 90/3, "celery");
		Duck wolfgangDuck = new Duck("Wolfgang", 60/3, "cheeseburgers");

		mobyDuck.waddle();
		System.out.println(mobyDuck.toString());
		System.out.println(wolfgangDuck);

		
		// Exercise: Make the Duck quack
		mobyDuck.quack();
		
	}

}
