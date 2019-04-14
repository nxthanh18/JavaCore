/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex2;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        MyCircle cir = new MyCircle();
        cir.setX(10);
        cir.setY(15);
        cir.setRadius(10);
        
        cir.display();
        System.out.println(cir.acreageCircle());
    }
}
