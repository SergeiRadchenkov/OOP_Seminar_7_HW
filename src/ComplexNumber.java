public class ComplexNumber {

    // z = a + bi

    private double a;
    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNumber plus(ComplexNumber other) {
        return new ComplexNumber(this.a + other.a, this.b + other.b);
    }

    public ComplexNumber multi(ComplexNumber other) {
        double resultA = this.a * other.a - this.b * other.b;
        double resultB = this.a * other.b + this.b * other.a;
        return new ComplexNumber(resultA, resultB);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divider = other.a * other.a + other.b * other.b;
        double resultA = (this.a * other.a + this.b * other.b) / divider;
        double resultB = (this.b * other.a - this.a * other.b) / divider;
        return new ComplexNumber(resultA, resultB);
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }
}
