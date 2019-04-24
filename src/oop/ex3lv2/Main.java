/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex3lv2;

/**
 *
 * @author genharunari
 */
public class Main {
    public static void main(String[] args) {
        ThiSinh thi = new ThiSinh("Barack Obama", 8.5f, 9.4f, 7.0f);
        
        thi.toString();
        System.out.println("TOTAL SCORE: " + thi.sumScore());
        
        ThiSinhManagement ts = new ThiSinhManagement();
        ts.run();
    }
}
