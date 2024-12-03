public class Motorbike extends Vehicle {
    private static int numberofmotorbikes = 0;

    private String motorbike_brand;

    public Motorbike(String motorbike_brand) {
        super(motorbike_brand);
        System.out.println("a motorbike is produced ");
        numberofmotorbikes++;
    }

    public void move() {
        System.out.println("Motorbike can move and accelerate too!");
    }

    public static int getNumberofmotorbikes() {
        return numberofmotorbikes;
    }
}
