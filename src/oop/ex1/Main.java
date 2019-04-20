/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex1;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        MyPoint mypoint = new MyPoint(10 , 10);
        mypoint.setX(3);
        mypoint.setY(5);
        MyPoint mypoint1 = new MyPoint();
        mypoint1.setX(9);
        mypoint1.setY(10);
        
        MyPoint mypoint2 = new MyPoint();
        mypoint2.setX(20);
        mypoint2.setY(20);
        
        mypoint.display();
        System.out.println("\n" + mypoint.distance(mypoint1));
        System.out.println(MyPoint.distance(mypoint1, mypoint2));
    }
}
