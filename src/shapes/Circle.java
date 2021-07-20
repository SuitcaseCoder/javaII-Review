package shapes;

import java.awt.*;

// step 5:
public  class Circle extends GraphicObject{
    // defining Circle's properties
// step 5a:
    
    public static void main(String[] args) {
        // instantiate Circle (create a new instance of Circle)
    // step 6a:
        GraphicObject round = new Circle();

        // apply correct properties:
    // step 6b:

        // call the abstract methods:
    // step 6c:
        round.draw();

        // call regular methods from the parent class

        
        
    }
    
    // Circle MUST implement (define its actions) of any
    // abstract methods from its abstract parent class
    // OR
    // you can make this subclass (Circle) abstract
// step 5c:
    void draw(){
        // this is where the implementation goes
        // this is where the actual action will be defined
        System.out.println("draw a circle by making a round line without" +
                                   " any corners");
    };

    void resize(){
        System.out.println("Let's make the circle smaller");
    }

    void fillColor(){
        System.out.println("let's make the circle red");
    }
    
    

}
