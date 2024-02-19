public class Hilsen {
   public static void main(String[] args) {
       HilsenDemo hilsen1 = new HilsenDemo("Mette");
       hilsen1.udprint();
   /*
        String inputname = "Martin";

        //System.out.println("Hej " + hejMedReturn(inputname));
        Hilsen lilleHilsen = new Hilsen();
        lilleHilsen.hej(inputname);
       //lilleHilsen.hejMedReturn("Mark");
        System.out.println(lilleHilsen.hejMedReturn("Mark"));
    */
   }

    public void hej(String name) {
        System.out.println("Hej " + name);

    }
/*
public static void hej(String name) {
    System.out.println("Hej" + name);
}
 */
public static String hejMedReturn(String name) {
        return name;
    }


}