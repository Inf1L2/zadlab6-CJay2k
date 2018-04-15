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
            return re + "+" + im + "i";
        } else {
            return re + "" + im + "i";
        }
    }
    
    public double liczModol(){
        return Math.sqrt(Math.pow(this.re, 2)+Math.pow(this.im, 2));
    }
    
    public void liczSprzezenie(){
        if(this.im>0){
            System.out.println(this.re + "" + -this.im + "i");
        } else{
            System.out.println(this.re + "+" + -this.im + "i");
        }
    }

    public void zmienNaWykladnicza(){
        double sin, cos, fi;
        sin=this.im/liczModol();
        cos=this.re/liczModol();
        fi=Math.atan2(this.re, this.im);
        /*if(sin==0 && cos==1){
            fi=0;
        } else if(sin==1/2 && cos==Math.sqrt(3)/2){
            fi=Math.PI/6;
        } else if(sin==Math.sqrt(2)/2 && cos==Math.sqrt(2)/2){
            fi=Math.PI/4;
        } else if(sin==Math.sqrt(3)/2 && cos==1/2){
            fi=Math.PI/3;
        } else {
            fi=Math.PI/2;
        }*/
        System.out.println(sin + " " + cos);
        System.out.println(liczModol() + "*e^" + fi + "i");
    }
    
    public String dodajAlgebraicznie(Complex complex1){
        double x=this.re+complex1.re;
        double y=this.im+complex1.im;
        if(y>=0){
            return x + "+" + y + "i";
        } else {
            return x + "" + y + "i";
        }
    }
    
    public String odejmijAlgebraicznie(Complex complex1){
        double x=this.re-complex1.re;
        double y=this.im-complex1.im;
        if(y>=0){
            return x + "+" + y + "i";
        } else {
            return x + "" + y + "i";
        }
    }
}
