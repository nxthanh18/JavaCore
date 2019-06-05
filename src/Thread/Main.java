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
public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
        
        t1.setPriority(Thread.MAX_PRIORITY);//10
        t2.setPriority(Thread.MIN_PRIORITY);//1

//        Thread t3 = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(100);
//                    } catch (Exception e) {}
//                }
//            }
//        };
//        t3.start();
        
        MyRunnable run1 = new MyRunnable();
        Thread t4 = new Thread(run1);
//        t4.start();
        
        try{
            t1.join();
            t2.join();
            t4.join();
        }catch(InterruptedException ex){}
        
        System.out.println(Thread.currentThread().getName());
        System.out.println("FINISH");
//        
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                
//            }
//        }).start();
    }
}
