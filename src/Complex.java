class Complex extends Rational {

    double image; // мнимая часть

    public Complex(double real, double image) {// конструктор с параметрами
        super.real = real;
        this.image = image;
    }

    public Complex() {
//        this(0,0);
    }



    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;


    }
}