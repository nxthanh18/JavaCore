/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Shape> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            int ras = rand.nextInt(10);
            Shape c = new Circle(ras);
            list.add(c);
            
            int w = rand.nextInt(50);
            int h = rand.nextInt(50);
            Shape r = new Rectangle(w, h);
            list.add(r);
        }
        
        // Sap xep giam dan (o2 - o1)
        Collections.sort(list, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return (int) (o2.gerArea() - o1.gerArea());
            }
        });
        
        for(Shape s: list){
            System.out.println(s.gerArea());
        }
    }
}
