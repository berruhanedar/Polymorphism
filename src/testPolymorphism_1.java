import java.util.Vector;

public class testPolymorphism_1 {
    public static void main(String[] args) {

        Vector<Vehicle> v = new Vector<Vehicle>(10);

        //Bunlar Vehicle için referans
        Vehicle vh;
        Vehicle vh1, vh2, vh3;


        vh1 = new Motorbike("34 ABC 456");
        v.add(vh1);
        vh1.move();

        vh3 = new Motorbike("34 FEG 488");
        vh3.move();
        v.add(vh3);

        vh2 = new Car();
        vh2.move();
        v.add(vh2);
        System.out.println("\n-------------------------");
        for(int i=0; i<v.size(); i++){
            vh = (Vehicle)v.get(i);
            vh.move();

        }
    }






}
