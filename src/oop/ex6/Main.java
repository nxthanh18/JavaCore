/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex6;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Nguyen Van A", "Java Core", 0.5f);
        
        StudentManagement stu = new StudentManagement();
        stu.run();
    }
}