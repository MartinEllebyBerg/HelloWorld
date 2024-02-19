import java.util.Scanner;

//MAIN METODE
public class HoldDemo {
    Scanner findStuderende = new Scanner(System.in);

    public static void main(String[] args) {
HoldAfStuderende dat24 = new HoldAfStuderende();
dat24.tilføjStuderende("Mette");
dat24.tilføjStuderende("Mark");
dat24.tilføjStuderende("Marco");
dat24.tilføjStuderende("Martin");
dat24.tilføjStuderende("Signe");

dat24.udskrivHold();
System.out.println(dat24.findStuderende("Marc"));
    }

}