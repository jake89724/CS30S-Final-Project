/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

import javax.swing.JOptionPane;

/**
 * Teacher: Mr.Wachs 
 * February 15th 2021 
 * Reduces Fractions
 * @author JAKE
 */
public class Fractions {

    //a very proffessional constant 
    final public static int A_BIG_NUMBER = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null,
                "Enter Fraction", "ENTER", JOptionPane.QUESTION_MESSAGE);
        int numerator = getNumerator(userInput);
        int denominator = getDenominator(userInput);
        reduce(denominator, numerator);
    }

    /**
     * Gets the numerator and converts to int
     *
     * @param takes in the user input as a string
     * @return the individual numerator as an int
     */
    private static int getNumerator(String userInput) {
        String main = "";
        boolean stop = false;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '/') {
                stop = true;
                i = userInput.length();
            } else if (stop == false) {
                main += userInput.charAt(i);
            }
        }
        int numerator = Integer.parseInt(main);
        System.out.println("numerator --> " + numerator);
        return (numerator);
    }

    /**
     * Gets denominator and converts it to an int
     *
     * @param userInput Takes in the user input as a string
     * @return The denominator as an int
     */
    private static int getDenominator(String userInput) {
        String main = "";
        boolean start = false;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '/') {
                start = true;
            } else if (start == true) {
                main += userInput.charAt(i);
            }
        }
        int Denominator = Integer.parseInt(main);
        System.out.println(Denominator);
        return (Denominator);
    }

    /**
     * reduces both numerator and denominator
     *
     * @param denominator the denominator as an int
     * @param numerator the numerator as an int
     */
    private static void reduce(int denominator, int numerator) {
        boolean stop = false;
        for (int i = 1; i < A_BIG_NUMBER; i++) {
            stop = false;
            while (stop == false) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    if (i == 1) {
                        stop = true;
                    }
                } else {
                    stop = true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, numerator + "/" + denominator,
                "Answer!", JOptionPane.INFORMATION_MESSAGE);
    }
}
