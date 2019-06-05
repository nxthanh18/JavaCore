/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.Random;

/**
 *
 * @author genharunari
 */
public class GenericsDemo {
    
    public static <T> void printArray(T[] arr) {
        for(T v: arr){
            System.out.print(v + " ");
        }
        System.out.println();
    }
    
    public static <T> void randomArray(T[] arr){
        Random ran = new Random();
        for(int i = 0; i < arr.length; i++){
            int iRand = ran.nextInt(arr.length);
            T tmp =  arr[i];
            arr[i] = arr[iRand];
            arr[iRand] = tmp;
        }
    }
    
    public static <T> T[] randomArrayReturn(T[] arr){
        T[] randomArr = arr.clone();
        randomArray(randomArr);
        return randomArr;
    }
    
    public static void main(String[] args) {
        Integer[] a = {1, 3, 2, 4};
        Float[] b = {10.5f, 21.6f, 39.9f};
        
        printArray(a);
        printArray(b);
        
        randomArray(a);
        printArray(a);
        
        Float[] c = randomArrayReturn(b);
        printArray(c);
        printArray(b);
        
        // vao truoc ra sau. vao sau ra truoc
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        while(!stack.isEmpty()){
            int v = stack.pop();
            System.out.print(v + " ");
        }
    }
}
