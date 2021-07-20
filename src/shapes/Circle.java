package shapes;

public class Circle extends GraphicObject{
    void draw(){
        System.out.println("round circle");
    };
    
    void resize(){
        System.out.println("resize circle");
    }
    
    Circle round = new Circle();
}
