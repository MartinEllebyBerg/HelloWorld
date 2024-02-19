public class HoldAfStuderende {

    //OPRETTELSE AF NY ARRAY
    private String[] studerendeListe = new String[5];
    private String name;
    private int antalStuderende = 0;

   // KONSTRUKTØR (HEDDER DET SAMME SOM CLASS)
    public HoldAfStuderende() {
    }

   //METODE
    public void tilføjStuderende(String navn) {
        if (antalStuderende<5) {
            studerendeListe[antalStuderende] = navn;
            antalStuderende++;
        }
    }

    //METODE
    public void udskrivHold() {
        for (String s:studerendeListe) {
            System.out.println(s);
        }
}
public boolean findStuderende(String navn) {
        boolean erFundet = false;
        for (String søgenavn : studerendeListe){
            if (søgenavn.equals(navn)){
                erFundet = true;
            }
        }
    return erFundet;
}
}
