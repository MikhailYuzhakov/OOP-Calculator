class Rational{
    double real; // реальная часть


    public Rational(double real) {// конструктор с параметрами
        this.real = real;

    }

    public Rational() {
//        this(0);
    }

    public double getReal() {
        return real;
    }

    protected void setReal(double real) {
        this.real = real;
    }




}
