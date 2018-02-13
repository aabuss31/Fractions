/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

/**
 *
 * @author aaron.buss
 */
public class FractionDriver {
    public static void main(String[] args) {
        Fraction a = new Fraction(1,2);
        System.out.println("The numerator: " + a.getNumerator());
        a.setNumerator(3);
        System.out.println("The numerator is " + a.getNumerator());

        
    }
}
