public class EnarmetTyveknægt {
    public static void main(String[] args) {
        Terning kast1 = new Terning();
        Terning kast2 = new Terning();
        Terning kast3 = new Terning();

        int forsøg = 0;
        int sum = 0;

        while (!(kast1.faceValue == kast2.faceValue && kast1.faceValue == kast3.faceValue)) {
            kast1.roll();
            kast2.roll();
            kast3.roll();
            sum = (kast3.faceValue + kast2.faceValue + kast1.faceValue);
            System.out.println(kast3.faceValue + " + " + kast2.faceValue + " + " + kast1.faceValue + " = " + sum);
            forsøg++;
        }
            System.out.println("Du har brugt " + forsøg + " forsøg.");
        System.out.println("Du har slået tre ens " + kast3.faceValue + "'ere, og det giver en sum på " + sum + ".");



        }
    }

