package ru.elengaupt.math;
import com.sun.jdi.connect.Connector;

import java.io.StringReader;
import java.math.BigInteger;
public class Fraction extends Number{
    private int numerator;
    private int denominator;

    public static float sum(Number...nums){
        float result = 0;

        for(int i = 0; i < nums.length; i++){
            result += nums[i].floatValue();
        }

        return result;
    }

    @Override
    public boolean equals(Object fraction){
        if(fraction.getClass() != Fraction.class) return false;
        return numerator == ((Fraction) fraction).numerator &&
               denominator == ((Fraction) fraction).denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if (denominator < 1) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю!");
        }
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    @Override
    public int intValue(){
        return numerator / denominator;
    }

    @Override
    public long longValue(){
        return (long)(numerator / denominator);
    }

    @Override
    public float floatValue(){
        return (float)numerator / denominator;
    }

    @Override
    public double doubleValue(){
        return (double)numerator / denominator;
    }

    public Fraction sum(Fraction fraction2){
        return new Fraction(this.numerator * fraction2.denominator + fraction2.numerator * this.denominator,
                this.denominator * fraction2.denominator);
    }

    public Fraction minus(Fraction fraction2){
        return new Fraction(this.numerator * fraction2.denominator - fraction2.numerator * this.denominator,
                           this.denominator * fraction2.denominator);
    }

    public Fraction minus(int num){
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
