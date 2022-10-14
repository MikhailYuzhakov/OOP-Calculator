public class MultModel extends CalcModel {

    @Override
    public Complex result() {
        double newReal = super.b.getReal()*super.a.getReal() - super.b.getImage()*super.a.getImage();
        double newImage = super.b.getImage()*super.a.getReal() + super.a.getImage()*super.b.getReal();
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
