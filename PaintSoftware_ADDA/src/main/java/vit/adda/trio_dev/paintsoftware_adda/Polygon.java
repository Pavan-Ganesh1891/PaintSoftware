package vit.adda.trio_dev.paintsoftware_adda;
import java.util.List;

public class Polygon  {
    private List<Point> vertices;
    
    public Polygon(){
        
    }
    
    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    public void draw() {
        System.out.println("Drawing Polygon with vertices at: " + vertices);
    }

    public void erase() {
        System.out.println("Erasing Polygon.");
    }

    public void move(String direction, int units) {
        System.out.println("Moved polygon to: " + direction +"by "+ units);
    }

    public String resize() {
        System.out.println("Polygon is resized.");
        String msg="resizing of the shape is done";
        return msg;
    }
}



