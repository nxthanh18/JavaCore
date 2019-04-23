/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex2lv2;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        Person per = new Person("Donald Trump", "Male", 72);
        
        StudentAndTeacherManagement st = new StudentAndTeacherManagement();
        st.run();
    }
}
