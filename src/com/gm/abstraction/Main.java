package com.gm.abstraction;

public class Main {

    //Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    //Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message.
    // You don't know the internal processing about the message delivery.

    // what the object does instead of how it does it.

    //Rule: If there is an abstract method in a class, that class must be abstract.


    public static void main(String[] args) {
        Bike honda = new Honda();
        honda.run();
    }

}
