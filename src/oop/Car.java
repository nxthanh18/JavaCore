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
public class Car {
    static int count;
    String name, color, product;
    
    //Mac dinh cho ham dung 1 ten mac dinh cua doi tuong. it nhat phai co 1 ham dung mac dinh
    public Car(){
        name = "";
        color = "";
        product = "";
        count++;
    }
    
    public Car(String name, String color, String p){
        this.name = name;
        this.color = color;
        product = p;
        count++;
    }
        
    public Car(String n){
        name = n;
        color = "";
        product = "";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getProduct(){
        return product;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
    
    public void useBrake(){
        System.out.println("Use Brake");
    }
    
    public void increaseGas(){
        System.out.println("Increase Gas");
    }
    
    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Color: %s, Product: %s", name, color, product);
    }
    
    
}
