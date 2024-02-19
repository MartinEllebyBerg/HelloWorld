public class DigitalClockDemo {

    public static void main(String[] args) throws InterruptedException {
    ClockDisplay myClock = new ClockDisplay();

    while (true) {
        myClock.TimeTick();
        System.out.println(myClock.getDisplaystring());

       Thread.sleep(1000); // FORSINKER HVER LINJE DEN PRINTER MED 1 SEK
        }
    }
}
