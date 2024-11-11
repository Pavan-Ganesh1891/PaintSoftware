package vit.adda.trio_dev.paintsoftware_adda;

public class Rectangle {
    private int width;
    private int height;
    private Point topLeft;
    
    public Rectangle(){
        
    }
    
    public Rectangle(int width, int height, Point topLeft) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    public void draw() {
        System.out.println("Drawing Rectangle with width " + width + ", height " + height + " at top-left " + topLeft);
    }

    public void erase() {
        System.out.println("Erasing Rectangle.");
    }

    public void move(String direction, int units) {
        System.out.println("Moved rectangle to: " + direction +"by "+ units);
    }

    public String resize(int newWidth, int newHeight) {
        System.out.println("Rectangle resized to width " + newWidth + " and height " + newHeight);
        String msg="resizing of the shape is done";
        return msg;
    }
}

