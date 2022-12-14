package com.engeto.ukoly.lekce3.DuLekce3;

import java.util.Scanner;

public class Support {

    private static Scanner scanner = null;
    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static int INVALID_INPUT = -1;

    /**
     * Read one integer. If given input cannot be converted to integer,
     * prints error and return -1;
     * @return Integer read or -1 if invalid input entered
     */
    public static int safeReadInt() {
        int result = INVALID_INPUT;
        for (int i = 10; i > 0; i--) {


            String inputText = getScanner().nextLine();
            try {
                result = Integer.parseInt(inputText);
                break;
            } catch (NumberFormatException ex) {
                if (i == 1) {
                    throw ex;
                } else{
                    System.err.println("Zadal jsi text, který nelze převést na celé číslo: " + inputText + "\n máte ještě " + (i - 1) + " pokusů na zadání správného čísla.");
            }
            }
        }
        return result;
    }

}