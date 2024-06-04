package com.gm.objects.rectangle;

public class Rectangle{
    float height;
    float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public void calculateArea(){
        System.out.println("The Area of rectangle is : " + height*width );
    }
}
