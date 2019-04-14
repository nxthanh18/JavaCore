/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex3;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle();
        rec.setX(10);
        rec.setY(15);
        rec.setWidth(20);
        rec.setHeight(30);
        
        rec.display();
        System.out.println(rec.acreageRectangle());
    }
}
