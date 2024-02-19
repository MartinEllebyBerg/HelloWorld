import java.util.Random;
public class Terning {

        int MAX = 6;
        int faceValue;
        Random randomTal = new Random();

    // Konstruktør
        public Terning() {
            this.faceValue = randomTal.nextInt(MAX)+1;
        }

        public void roll() {
            this.faceValue = randomTal.nextInt(MAX)+1;
    }
}
