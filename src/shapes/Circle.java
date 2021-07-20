package shapes;

import java.awt.*;

public class Circle extends GraphicObject{
    // defining Circle's properties
    int radius;
    int diameter;
    String color;
    
    public static void main(String[] args) {
//        // instantiate Circle (create a new instance of Circle)
//        Circle round = new Circle();
//
//        // apply correct properties:
//        round.x = 10;
//        round.y = 8;
//        round.radius = 4;
//        round.diameter = 7;
//        round.color = "gray";
//
//        // Circle MUST implement (define its actions) of any
//        // abstract methods from its abstract parent class
//        // OR
//        // you can make this subclass (Circle) abstract
//        round.draw();
//        round.resize();
//        round.color();
//
//        // call regular methods from the parent class
//        round.moveTo(4,10);
        
        
    }
    void draw(){
        System.out.printf("let's draw a circle with the following " +
                                  "properties:%n radius: %s%n diameter: %s%n",
                this.radius,this.diameter);
    }
    
    void resize(){
        this.radius = 16;
        this.diameter = 20;
        System.out.printf("%nResized circle now has the following " +
                                   "properties:%n radius: %s%n diameter:" +
                                  " %s%n", this.diameter, this.radius);
    }
    
    void color(){
        System.out.printf("%nLet's change the color from %s to %s%n",
                this.color, this.color="orange" );
    }
    
    
}
