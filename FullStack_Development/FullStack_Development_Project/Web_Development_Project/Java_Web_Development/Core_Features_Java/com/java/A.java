package com.java;



public class A {

    private int count = 0;

    public  void  increment(){

        synchronized(this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

