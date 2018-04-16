/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zad3;

import java.util.Scanner;

/**
 *
 * @author Adrian Hrycaj
 */
public class Main {
    public static void main(String[] args) {
        double re, im;
        int c;
        Complex complex;
        Complex complex1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("---------------------------------"); 
            System.out.println("MENU");
            System.out.println("1. Obliczanie modułu liczby zespolonej");                               //działa
            System.out.println("2. Obliczenie wartości liczby sprzężonej do liczby zespolonej");        //działa
            System.out.println("3. Zamiana postaci algebraicznej liczby zespolonej na wykładniczą");    //działa
            System.out.println("4. Zamiana postaci wykładniczej liczby zespolonej na algebraiczną");    //działa
            System.out.println("5. Dodawanie (z argumentami w postaci algebraicznej)");                 //działa
            System.out.println("6. Dodawanie (z argumentami w postaci wykładnicze)");                   //
            System.out.println("7. Odejmowanie (z argumentami w postaci algebraicznej)");               //działa
            System.out.println("8. Mnożenie (z argumentami w postaci algebraicznej)");                  //
            System.out.println("9. Dzielenie (z argumentami w postaci algebraicznej)");                 //działa
            System.out.println("10. Dzielenie (z argumentami w postaci wykładniczej)");                 //
            System.out.println("0. Wyjdź");
            System.out.print("Co chcesz zrobić?: ");
            c=scanner.nextInt();

            switch (c) {
                case 1:
                    System.out.print("Podaj część rzeczywistą liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    System.out.println("Moduł podanej liczby zespolonej " + complex.toString() + " to : " + complex.liczModol());
                break;

                case 2:
                    System.out.print("Podaj część rzeczywistą liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    System.out.println("Sprzężenie podanej liczby zespolonej " + complex.toString() + " to: ");
                    complex.liczSprzezenie();
                break;
                
                case 3:
                    System.out.print("Podaj część rzeczywistą liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    System.out.println("Postać wykładnicza liczby zespolonej " + complex.toString() + " to: ");
                    complex.zmienNaWykladnicza();
                break;

                case 4:
                    System.out.print("Podaj moduł liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj argument liczby zespolonej (w radianach): ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    System.out.println("Postać wykładnicza liczby zespolonej " + complex.wykladniczaToString() + " to: ");
                    complex.zmienNaAlgebraiczna();
                break;
                
                case 5:
                    System.out.print("Podaj część rzeczywistą pierwszej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną pierwszej liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    
                    System.out.print("Podaj część rzeczywistą drugiej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną drugiej liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex1 = new Complex(re, im);
                    System.out.println("Wynik dodawania tych liczb to: ");
                    complex.dodajAlgebraicznie(complex1);
                break;
                
                case 6:
                    System.out.print("Podaj moduł pierwszej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj argument pierwszej liczby zespolonej (w radianach): ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    
                    System.out.print("Podaj moduł drugiej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj argument drugiej liczby zespolonej (w radianach): ");
                    im=scanner.nextDouble();
                    complex1 = new Complex(re, im);
                    
                    System.out.println("Wynik dodawania tych liczb to ");
                    complex.dodajWykladniczo(complex1);
                break;
                
                case 7:
                    System.out.print("Podaj część rzeczywistą pierwszej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną pierwszej liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex = new Complex(re, im);
                    
                    System.out.print("Podaj część rzeczywistą drugiej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną drugiej liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex1 = new Complex(re, im);
                    System.out.println("Wynik odejmowania tych liczb to: ");
                    complex.odejmijAlgebraicznie(complex1);
                break;
                
                case 8:
                    
                break;
                
                case 9:
                    System.out.print("Podaj część rzeczywistą pierwszej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną pierwszej liczby zespolonej: ");
                    im=scanner.nextInt();
                    complex = new Complex(re, im);
                    
                    System.out.print("Podaj część rzeczywistą drugiej liczby zespolonej: ");
                    re=scanner.nextDouble();
                    System.out.print("Podaj część urojoną drugiej liczby zespolonej: ");
                    im=scanner.nextDouble();
                    complex1 = new Complex(re, im);
                    System.out.println("Wynik dzielenia tych liczb to: " + complex.podzielAlgebraicznie(complex1));
                break;
                
                case 10:
                    
                break;
                
                case 0:
                    System.out.println("Pa");
                break;
                
                default:
                    System.out.println("Wybrano złą opcję");
            }   
        }while(c!=0); 
    }
}
