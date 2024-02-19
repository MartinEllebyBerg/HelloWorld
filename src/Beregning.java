public class Beregning {
    public static void main(String[] args) {
       /*
        int x = 5;
        int y = 3;
        int sum = (x+y);
        int produkt = (x*y);

        System.out.println(sum);
        System.out.println(produkt);
*/

        Regnemaskine regnemaskine = new Regnemaskine(10.5, 7.2);

        System.out.println("Addition: " + regnemaskine.addition());
        System.out.println("Substraction: " + regnemaskine.substraction());
        System.out.println("Multiplikation: " + regnemaskine.multiplikation());
        System.out.println("Division: " + regnemaskine.division());

        regnemaskine.x = 3.3;
        regnemaskine.y = 6.6;

        System.out.println("Ny værdi af x og y skrevet herover: " + regnemaskine.addition());
        System.out.println("Ny værdi af x og y skrevet herover: " + regnemaskine.multiplikation());
    }
}
