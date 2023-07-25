public class Office {
    public static void main(String[] args){
        Doctor surgeon = new Surgeon();

        Doctor pract = new GeneralPracticioner();

        Doctor gen = new Doctor();


        surgeon.doMedicine();
        pract.doMedicine();
        gen.doMedicine();
    }
}
