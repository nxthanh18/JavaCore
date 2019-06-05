/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclass;

/**
 *
 * @author genharunari
 */
public class Outer {
    public Outer(){
        System.out.println("Outer::Outer");
    }
    
    public void info(){
        System.out.println("Outer::info");
    }
    
    public class Inner{
        public Inner(){
            System.out.println("Inner::Inner");
        }
        
        public void info(){
            System.out.println("Inner::info");
        }
    }
    
    public static class StaticInner{
        public StaticInner(){
            System.out.println("StaticInner::StaticInner");
        }
        
        public void info(){
            System.out.println("StaticInner::info");
        }
    }
}
