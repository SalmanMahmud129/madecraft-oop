import java.util.List;

public class UnitedNations {
    public static void main(String[] args){
        // this is polymorphism
        // new Country().dance();
        // new Ireland().dance();
        // new Brazil().dance();



        Country country = new Country();
        Ireland ire = new Ireland();
        Brazil brazil = new Brazil();

        List<Country> countries = List.of(ire, brazil);

        for(Country c : countries){
            c.dance();
        }
    }
}
