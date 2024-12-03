import java.util.Random;
import java.util.Vector;

public class testPolymorphism_2 {
    public static void main(String[] args) {

        Vector<Vehicle> v = new Vector<>(10);

        Random rand = new Random();

        Vehicle vh;

        for (int i = 0; i < 10; i++) {
            int r = rand.nextInt(2);
            if (r == 0) {
                vh = new Motorbike("34 Motorbike " + i);
                v.add(vh);
            } else if (r == 1) {
                v.add(new Car("34 Car " + i));
            } else
                System.out.println("\nimpossible case");
            }


            //Polymorphism uygulanan metot  "move"
            for (int i = 0; i < v.size(); i++ ){
                vh = v.get(i);
                vh.move();

            }
        }
    }
}
