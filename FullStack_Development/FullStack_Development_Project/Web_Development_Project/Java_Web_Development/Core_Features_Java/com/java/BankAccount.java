package com.java;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw" + amount);

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() + "procedding with withdrawl");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

            balance-=amount;
            System.out.println(Thread.currentThread().getName() + "completed withdrawl" + balance);
        }else{
            System.out.println(Thread.currentThread().getName() + "Insufficient balance");
        }
    }
}

