public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displaystring;

    //KONSTRUKTØR
    public ClockDisplay() {

        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    // METODE DER FÅR TIDEN TIL AT OPDATERE
    public void TimeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }
    // METODE DER FÅR FREMVIST EN TID PÅ URET
    public String getDisplaystring() {
        return displaystring;
    }
    // METODE DER OPDATERER DISPLAYET PÅ URET
    private void updateDisplay() {
        displaystring = hours.getDisplayValue() + ":" + minutes.getValue();
    }
}
