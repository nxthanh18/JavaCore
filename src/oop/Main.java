/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mec", "Red", "Laos");
        car.setName("ABC");
        car.setColor("Black");
        car.setProduct("Honda");
        System.out.println(car.toString());
        
        car.increaseGas();
        car.useBrake();
        
        Car car1 = new Car();
        
        System.out.println("Count: " + Car.getCount());
    }
}
