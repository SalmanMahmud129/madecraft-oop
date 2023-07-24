package examples;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// objects are like a capsule, holds data associated and functionality --> encapsulation, dont want data or functionality accessible outside the object so we use private for the variables and methods
public class Duck {

	// member variables: data
	private String name;
	private int lifeExpectancy;
	private String favoriteFood;

	// constructor
	public Duck(String name, int lifeExpectancy, String favoriteFood){
		super();
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favoriteFood = favoriteFood;
	}

	// methods: functionality
	void waddle(){
		lifeExpectancy++;
		System.out.println(this.name + " is waddling");
	}

	void quack(){
		System.out.println("Quack Quack");
	}

	@Override
	public String toString(){
		return "My name is " + name + " and I like to eat " + favoriteFood + " , life expectancy: " + lifeExpectancy;
	}

}
