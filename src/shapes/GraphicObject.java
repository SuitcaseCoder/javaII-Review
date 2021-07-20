package shapes;

abstract class GraphicObject {
    //define member variables - variables that will/can be used by all
    // subclasses
    // define a shape's starting postion
    int x,y;
    
    //non-abstract (regular) method that can be implemented the same no
    // matter what the subclass is
    void moveTo(int newX, int newY){
        System.out.printf("%nNew coordinates: %s %s%n", newX, newY);
    };
    
    // abstract methods, that can be used by every subclass of
    // GraphicObject, but will be implemented differently
    abstract void draw();
    abstract void resize();
    abstract void color();
}
