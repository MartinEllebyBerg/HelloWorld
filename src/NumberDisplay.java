public class NumberDisplay {
    //ATTRIBUTER / VARIABLER.
    private int limit;
    private int value;

    //KONSTRUKTØR
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }
    //GETTER METODE
    public int getValue() {
                return value;
    }

    // METODE DER FREMVISER TALLENE SOM TEKST
    public String getDisplayValue() {
       if (value<10) {
           return "0" + value;
       }
        return "" + value;
    }
    //SETTER METODE
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }
    //METODE DER GØR DET MULIGT FOR VALUE AT STIGE VIA MODULO
    public void increment() {

        value = (value + 1) % limit; // 58 + 1 % 60 = 59
    }
}
