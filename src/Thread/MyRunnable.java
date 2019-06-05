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
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }    
}
