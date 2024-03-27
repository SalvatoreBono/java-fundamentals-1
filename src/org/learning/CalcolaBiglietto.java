package org.learning;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many kilometers do you want to travel?");
        int km = keyboard.nextInt();
        double totalPrice = km * 0.21;
        System.out.print("How old are you?");
        int age = keyboard.nextInt();
       if (age < 18){
            double discountUnder18 = totalPrice * 20 / 100 ;
            double priceWithDiscount = totalPrice - discountUnder18 ;
           System.out.println("il tuo biglietto costa " + priceWithDiscount + "€");
       } else if (age > 65) {
           double discountOver65 = totalPrice * 40 / 100 ;
           double priceWithDiscount = totalPrice - discountOver65 ;
           System.out.println("il tuo biglietto costa " + priceWithDiscount + "€");
       }else {
           System.out.println("il tuo biglietto costa " + totalPrice + "€");
       }
        keyboard.close();
    }
}
