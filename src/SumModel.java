class SumModel extends  CalcModel {

    @Override
    public Complex result() {
        double newReal = super.b.getReal() + super.a.getReal();
        double newImage = super.b.getImage() + super.a.getImage();
        Complex result = new Complex(newReal, newImage);

        return result;
    }

    @Override
    public void setA(Complex c) {
        super.a.real = c.getReal();
        super.a.image = c.getImage();
    }

    @Override
    public void setB(Complex c) {
        super.b.real = c.getReal();
        super.b.image = c.getImage();
    }
}

