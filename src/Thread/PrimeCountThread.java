/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.Calendar;

/**
 *
 * @author genharunari
 */
public class PrimeCountThread extends Thread{
    private int start, end, count;
    
    public PrimeCountThread(int start, int end){
        this.start = start;
        this.end = end;
        count = 0;
    }
    
    @Override
    public void run(){
        for(int i = start; i <= end; i++){
            if(isPrimeNumber(i)){
                count++;
            }
        }
    }
    
    public int getCount(){
        return count;
    }
    
    private boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        PrimeCountThread t1 = new PrimeCountThread(0, 10000000);
        PrimeCountThread t2 = new PrimeCountThread(10000001, 20000000);
        PrimeCountThread t3 = new PrimeCountThread(20000001, 30000000);
        PrimeCountThread t4 = new PrimeCountThread(30000001, 40000000);
        PrimeCountThread t5 = new PrimeCountThread(40000001, 50000000);
//        PrimeCountThread t6 = new PrimeCountThread(50000001, 60000000);
//        PrimeCountThread t7 = new PrimeCountThread(60000001, 70000000);
//        PrimeCountThread t8 = new PrimeCountThread(70000001, 80000000);
//        PrimeCountThread t9 = new PrimeCountThread(80000001, 90000000);
//        PrimeCountThread t10 = new PrimeCountThread(90000001, 100000000);
        
        long currentTime = Calendar.getInstance().getTimeInMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();
        
        try{
            t1.join();
        }catch(Exception e){}
        
        long time = Calendar.getInstance().getTimeInMillis() - currentTime;        
        System.out.println(t1.getCount());
        System.out.println("Time = " + time);
    }
    
}
