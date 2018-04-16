/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zad3;


/**
 *
 * @author Adrian Hrycaj
 */
public class Complex {
    private double re;
    private double im;
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        if(this.im>=0){
            return this.re + "+" + this.im + "i";
        } else {
            return this.re + "" + this.im + "i";
        }
    }
    
    public String wykladniczaToString() {
        return re + "*e^" + im + "i";
    }
    
    public double liczModol(){
        return Math.sqrt(Math.pow(this.re, 2)+Math.pow(this.im, 2));
    }
    
    public void liczSprzezenie(){
        this.im=-this.im;
        
        toString();
    }

    public void zmienNaWykladnicza(){
        this.im=Math.atan2(this.im, this.re);
        this.re=liczModol();
        
        
        System.out.println(wykladniczaToString());
    }
    
    public void zmienNaAlgebraiczna(){
        double x = this.re * Math.cos(this.im);
        double y = this.re * Math.sin(this.im);
        this.re=x;
        this.im=y;
        
        System.out.println(toString());
    }
    
    public void dodajAlgebraicznie(Complex complex1){
        this.re=this.re+complex1.re;
        this.im=this.im+complex1.im;
        
        System.out.println(toString());
    }
    
    public void dodajWykladniczo(Complex complex1){
        zmienNaAlgebraiczna();
        complex1.zmienNaAlgebraiczna();
        
        this.re=this.re+complex1.re;
        this.im=this.im+complex1.im;
        
        zmienNaWykladnicza();
    }
    
    public void odejmijAlgebraicznie(Complex complex1){
        this.re=this.re-complex1.re;
        this.im=this.im-complex1.im;
        
        System.out.println(toString());
    }
    
    public String podzielAlgebraicznie(Complex complex1){
        double x=this.re*complex1.re-this.im*-complex1.im;
        double y=this.re*-complex1.im+this.im*complex1.re;
        double z=Math.pow(complex1.re, 2)+Math.pow(complex1.im, 2);
        double a=x/z;
        double b=y/z;
        
        /*
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        */
        
        if(b>=0){
            return a + "+" + b + "i";
        } else {
            return a + "" + b + "i";
        }
    }
}
