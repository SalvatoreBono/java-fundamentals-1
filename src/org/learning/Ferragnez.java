package org.learning;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {
        String[] list = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your name?");
        String name = keyboard.nextLine();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(name)) {
                System.out.println("Welcome " + name + " you are on the list");
                break;
            } else {
                System.out.println("Sorry you are not on the list");
            }
        }
        keyboard.close();
    }
}
