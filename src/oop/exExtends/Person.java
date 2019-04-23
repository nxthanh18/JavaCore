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
public class Person {
    protected String name, address;
    protected int age;
    
    public Person(){
        name = "";
        address = "";
        age = 0;
    }
    
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void display(){
        System.out.println(name + " " + age + " " + address);
    }
}
