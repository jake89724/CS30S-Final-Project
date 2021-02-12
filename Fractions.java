/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

import javax.swing.JOptionPane;

/**
 *
 * @author j.head
 */
public class Fractions {

    final public static int A_BIG_NUMBER = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter Fraction");
        int numerator = getNumerator(userInput);
        int denominator = getDenominator(userInput);
        reduce(denominator, numerator);
    }

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

    private static void reduce(int denominator, int numerator) {
        int den = denominator;
        int num = numerator;
        for (int i = 1; i < A_BIG_NUMBER; i++) {
            System.out.println(den % i);
            System.out.println(num % i);
            if (den % i == 0 && num % i == 0) {

                System.out.println("made it");
                if (num / i != 0 || den / i != 0) {
                    den /= i;
                    num /= i;
                    System.out.println("den " + num);
                } else {
                    i = A_BIG_NUMBER;
                    JOptionPane.showMessageDialog(null,
                            num + "/" + den);
                }

                System.out.println(den);
                System.out.println(num);
            } else {
                i = A_BIG_NUMBER;
                JOptionPane.showMessageDialog(null,
                        num + "/" + den);
            }

        }

    }

}
