package numericExer.n1_5;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fraction2){
        return new Fraction(this.numerator * fraction2.denominator + fraction2.numerator * this.denominator,
                this.denominator * fraction2.denominator);
    }

    public Fraction subtract(Fraction fraction2){
        return new Fraction(this.numerator * fraction2.denominator - fraction2.numerator * this.denominator,
                           this.denominator * fraction2.denominator);
    }

    public Fraction subtract(int num){
        return new Fraction(this.numerator - num * this.denominator,
                            this.denominator);
    }

    public Fraction divide(Fraction fraction2){
        return multiply(new Fraction(fraction2.denominator, fraction2.numerator));
    }

    public Fraction divide(int num){
        return multiply(new Fraction(1, num));
    }

    public Fraction multiply(Fraction fraction2){
        return new Fraction(this.numerator * fraction2.numerator, this.denominator * fraction2.denominator);
    }

    public Fraction multiply(int num){
        return new Fraction(this.numerator * num, this.denominator);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
}
