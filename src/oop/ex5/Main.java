/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex5;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        Fraction fra = new Fraction();
        
        fra.setNumerator(5);
        fra.setDenominator(10);
        
        fra.displayFration();
        fra.inverse();
        fra.irreducibleFraction();
        
        System.out.println(fra.add());
        System.out.println(fra.sub());
        System.out.println(fra.mul());
        System.out.println(fra.div());
    }
}
