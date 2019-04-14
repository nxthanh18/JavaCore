/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex4;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {        
        Triangle tri = new Triangle();
        
        tri.setA(10);
        tri.setB(15);
        tri.setC(20);
        
        tri.displayTriangle();
        System.out.println(tri.perimeterTriangle());
        System.out.println(tri.acreageTriangle());
    }    
}
