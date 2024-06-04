package com.gm.objects.accounts;

public class TestAccount
{

    public static void main(String[] args) {
        Account account1 = new Account(3123312, "Gowtham", 1000);

        Account account2 = new Account(434343, "Suriyan", 120);

        account1.deposit(43434);
        account2.withdraw(300);

    }

}
