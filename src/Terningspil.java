public class Terningspil {
    public static void main(String[] args) {
        Terning terning1 = new Terning(); //de to terninger er vores to instanser
        Terning terning2 = new Terning();


        //Her får vi en person til at kaste to terninger to gange i streg.
        //Den henter data fra Terning.java
/*      System.out.println(terning1.faceValue + " " + terning2.faceValue);
        terning1.roll(); terning2.roll();
        System.out.println(terning1.faceValue + " " + terning2.faceValue);
        */



        //Dette while loop gør at terningerne bliver ved med at rulle så længe summen af dem IKKE er 2
        //Når summen bliver 2, vil den printe SNAKE EYES. Forsøg++ er min counter for hvor mange gange den har rullet
        int sum = 0;
        int forsøg = 0;

        while (!(sum ==2)) {
    terning1.roll();
    terning2.roll();
    sum = terning1.faceValue + terning2.faceValue;
    System.out.println(terning1.faceValue + " + " + terning2.faceValue);
    forsøg++;
}
        System.out.println("SNAKE EYES!");
        System.out.println("GG");
        System.out.println("Der blev brugt " + forsøg + " forsøg");
    }
}
