package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class MyFavoriteFoods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] food = new String[5];
        System.out.println("Dimmi " + food.length + " cibi preferiti");
        for (int i = 0; i < food.length; i++) {
            food[i] = keyboard.nextLine();
        }
        System.out.println("Il tuo cibo preferito è: " + food[0]);
        System.out.println("Il tuo ultimo cibo preferito è: " + food[4]);
        System.out.println("Il cibo di mezzo è: " + food[2]);
        keyboard.close();
    }
}
