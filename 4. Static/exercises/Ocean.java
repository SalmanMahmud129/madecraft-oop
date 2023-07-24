package exercises;

public class Ocean {
    public static void main(String[] args){
        SeaCreature s1 = new SeaCreature("spongebob");

        s1.eat();
        s1.laugh();

        SeaCreature s2 = new SeaCreature("patrick");
        SeaCreature s3 = new SeaCreature("squidward");
        s2.laugh();
        s3.laugh();
    }
}
