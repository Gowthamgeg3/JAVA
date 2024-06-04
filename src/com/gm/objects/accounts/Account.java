package com.gm.objects.accounts;

public class Account {

    int accountNo;
    String name;
    float totalAmount;

    public Account(int accountNo, String name, float totalAmount) {
        this.accountNo = accountNo;
        this.name = name;
        this.totalAmount = totalAmount;
    }

    public void deposit(int amount){
        totalAmount = totalAmount+amount;
        System.out.println("Deposited now total balance is : " +totalAmount);
    }

    public void withdraw(int amount ){
        if(totalAmount>amount){
            totalAmount = totalAmount-amount;
            System.out.println("Withdrawed now available  balance is : " +totalAmount);
        }else
            System.out.println("insuffiemnt Balance");
            


    }
}
