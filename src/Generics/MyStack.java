/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.Vector;

/**
 *
 * @author genharunari
 */
public class MyStack <T>{
    private Vector<T> data;
    
    public MyStack(){
        data = new Vector<>();
    }
    
    public boolean isEmpty(){
        return data.isEmpty();
    }
    
    public void push(T element){
        data.add(0, element);
        // tuong tu nhau
        //data.addElement(element);
        //data.insertElementAt(element, 0);
    }
    
    public T pop(){
        T element = data.remove(0);
        return element;
    }
}
