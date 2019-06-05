/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author genharunari
 */
public class MyThread extends Thread{
    
    public MyThread(String name){
        super(name);
    }
    
    public MyThread(){
        super();
    }
    
    
    
    @Override
    public void run(){
        Utils.print(getName());
    }
}
