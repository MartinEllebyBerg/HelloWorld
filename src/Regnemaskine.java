public class Regnemaskine {
        double x;
        double y;

    public Regnemaskine(double x, double y) {
        this.x = x;
        this.y = y;
        //Konstruktør
    }
    public double addition(){
        double sum = 0;
        sum = x+y;
        return sum;
        //Eller man kan bare bruge "return x+y;"
    }

    public double substraction(){
        return x-y;
    }

    public double multiplikation(){
        double sum = 0;
        sum = x*y;
        return sum;
        //Eller man kan bare bruge "return x*y;"
    }
        public double division(){
            double sum = 0;
            sum = x/y;
            return sum;
            //Eller man kan bare bruge "return x/y;"

    }
}