public class NaivBilletautomat {

    private int pris; //Billetprisen
    private int saldo; //Beløb der indsættes i automat
    private int total;

    public NaivBilletautomat(int billetpris) /*Construktorens parameter er int billetpris */ {
        pris = billetpris;
        saldo = 0;
        total = 0;
    }

    public int getPris() {
        return pris;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int kroner) {
        saldo = saldo + kroner;
    }

    public void printBillet() {
        if (saldo >= pris) {
            System.out.println("########################");
            System.out.println("######## Linje F #######");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + " kr. ##");
            System.out.println();
            total = saldo + total;
            saldo = 0;
        }
    }
}