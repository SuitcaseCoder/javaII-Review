# Abstract-Classes-Review

## Abstract Class
- a class that is declared abstract using the `abstract` keyword
- it may or may not include abstract methods.
- Abstract classes **cannot** be instantiated, but they can be subclassed.
-  you can declare fields that are not static and final, and define public, protected, and private concrete methods.

## Abstract Method and its implementation
- a method that's declared but is not implemented
- subclasses of the abstract classes holding the abstract methods must 
  provide implementation for these abstract methods
- if the subclass does **not** implement the abstract method, then the 
  subclass must be declared `abstract` itself
  
## Why/When to use Abstract Classes
- You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
- example of an abstract class:
    - `AbstractMap` and its subclasses: `HashMap, TreeMap, ConcurrentHashMap`
    - many of the subclasses __share__ methods which are all defined in the `AbstractMap` `abstract` class : `get, put, isEmpty, containsKey, containsValue`

## Let's try it out:
 1. open up a java project and in the `src` folder create a `shapes` package;
 2. in the `shapes` package, create a new java class named `GraphicObject`
 3. make GraphicObject an abstract class using the `abstract` keyword:
    ``abstract class GraphicObject {...}``
 4.  within `Graphic Object` abstract class do the following:
     - **a**: create 2 member variables to define a shape's coordinates
     - ```java
       //define member variables - variables that will/can be used by all
       // subclasses
       // define a shape's starting position using x and y
        int x,y;
     
     - **b**: create a non-abstract (regular) void method that accepts 
     two parameters: `newx, newy` and `souts` out the new coordinates:
     - ```java
       //non-abstract (regular) method that can be implemented the same no
       // matter what the subclass is
       void moveTo(int newX, int newY){
        System.out.printf("%nNew coordinates: %s %s%n", newX, newY);
       };

     - **c**: create 3 abstract methods: `draw`, `resize`, and `color` using the `abstract` keyword, remember abstract methods are defined but not implemented - we don't know yet what they do
     - ```java
            // abstract methods, that can be used by every subclass of
            // GraphicObject, but will be implemented differently
            abstract void draw();
            abstract void resize();
            abstract void color();
            
 5. In your `shapes` package create a new `Circle` class that `extends` the  `GraphicObject` class and do the following:
    ```java
        public class Circle extends GraphicObject{ ... }
   - **a**: give your `Circle` class three properties: `int radius`, 
   `int diameter`, `String color` 
        ```java
         // defining Circle's properties
         int radius;
         int diameter;
         String color;
         ```
   - **b**: why do you have red squigglies
   - **c**: __implement__ the three abstract methods (`draw`, `resize`, `color`) ... give them
     - `draw` should print out what the circle's radius and diameter should be when it's drawn
     - `resize` should change and print out the circle's new radius and diameter
     - `color` should change and print out the circle's new color
     ```java
     // Circle MUST implement (define its actions) of any
     // abstract methods from its abstract parent class
     // OR
     // you can make this subclass (Circle) abstract
     // print out what the circle's radius and diameter
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
 6. In your `Circle`'s main method do the following:
   - **a**: instantiate a new Circle
        ```java
       // instantiate Circle (create a new instance of Circle)
        Circle round = new Circle();
        ```
   - **b**: assign some values to its properties:
        ```java
        // apply correct properties:
            round.x = 10;
            round.y = 8;
            round.radius = 4;
            round.diameter = 7;
            round.color = "gray";
        ```

   - **c**: call all four methods
        ```java
        // call the abstract methods:
        round.draw();
        round.resize();
        round.color();
    
        // call regular methods from the parent class
        round.moveTo(4,10);
        ```
   - **d**: run your code, you should see this:
        ```
        let's draw a circle with the following properties:
        radius: 4
        diameter: 7
        
        Resized circle now has the following properties:
        radius: 20
        diameter: 16
        
        Let's change the color from gray to orange
        
        New coordinates: 4 10
        ```




 
    

       

