package vit.adda.trio_dev.paintsoftware_adda;

public class Circle {
    private float radius;
    private Point center;
    
    public Circle(){
        
    }
    
    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
    
    float areaCal(float r){
        this.radius=r;
        float area=(float) (r*r*3.14);
        //System.out.println("Area of circle: "+area);
        return area;
    }
    
    float circumference(float r){
        this.radius=r;
        float circum=(float) (2*3.14*r);
        //System.out.println("Circumference of the circle: "+circum);
        return circum;
    }
    
    void setCenter(Point center){
        this.center=center;
    }
    
    void setRadius(float r){
        this.radius=r;
    }
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius + " at center " + center);
    }

    public void erase() {
        System.out.println("Erasing Circle.");
    }

    public void move(String direction, int units) {
        System.out.println("Moved Circle to: " + direction +" by "+ units);
    }

    public String resize(float newRadius) {
        String msg="resizing of the shape is done";
        System.out.println("Circle resized to radius " + newRadius);
        return msg;
    }
}

