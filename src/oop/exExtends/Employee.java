/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.exExtends;

/**
 *
 * @author genharunari
 */
public class Employee extends Person{    
    //Tai su dung ma nguon
    private int salary;
    
    public Employee(){
        name = "";
        address = "";
        age = 0;
        salary = 0;
    }
    
    public Employee(String name, String address, int age, int salary){
        super(name, address, age);                                                  // theo thu tu lop cha
        this.salary = salary;
    }

    @Override
    public void display() {
        //System.out.println(name + " " + age + " " + address + " " + salary); // Cach 1
        // Cach 2
        super.display();
        System.out.println(salary);
    }
}